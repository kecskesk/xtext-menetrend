package hu.bme.aut;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import lombok.Data;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Use builder methods
 *
 * @author kkrisz
 */
@Data
public class ScheduleData {
    private final Map<String, List<String>> filesOnPath = new HashMap<>();
    
    private final Map<String, Stop> stops = new HashMap<>();
    
    private final Map<Line, Map<Day, Map<Stop, DailySchedule>>> schedules = new HashMap<>();
    
    private final Map<Line, Trip> trips = new HashMap<>();  
    
    private static final Logger LOG = LoggerFactory.getLogger(ScheduleData.class);
    
    public ScheduleData loadFiles() throws IOException {
        Stream<Path> paths = Files.walk(Paths.get("src/main/resources/generated/")); 
        paths.forEach(filePath -> {
            if (Files.isRegularFile(filePath)) {
                System.out.println(filePath);
                try {
                    getFilesOnPath().put(filePath.getFileName().toString(), Files.readAllLines(filePath, StandardCharsets.ISO_8859_1));
                } catch (IOException e) {
                    LOG.error(e.getMessage(), e);
                }
            }
        });
        return this;
    }

    public ScheduleData populateStops() throws IOException {
        List<String> stopsFile = getFilesOnPath().get("stops.csv");
        if (stopsFile == null || stopsFile.size() != 1) {
            throw new IOException("stops.csv not ready to read");
        } else {
            for (String name : stopsFile.get(0).split(";")) {
                getStops().put(name, new Stop(name));
            }
            return this;
        }
    }

    public ScheduleData populateSchedules() throws ParseException {
        for (Map.Entry<String, List<String>> entry : getFilesOnPath().entrySet()) {
            String fileName = entry.getKey();
            List<String> rows = entry.getValue();

            if (fileName.startsWith("schedule")) {
                String[] lineParts = fileName.substring(8).split("-");

                LineType lineType = LineType.fromString(lineParts[0]);
                String lineId = lineParts[1].substring(0, lineParts[1].length() - 4);

                Line line = new Line(lineType, lineId);
                Map<Day, Map<Stop, DailySchedule>> dailySchedules = new HashMap<>();

                for (String row : rows) {
                    String[] rowParts = row.split(";");
                    if (rowParts.length == 1) {
                        LOG.error(row);
                    } else {
                        Day day = Day.fromString(rowParts[0]);
                        Stop stop = getStops().get(rowParts[1]);
                        List<DateTime> departures = new ArrayList<>();

                        SimpleDateFormat formatter = new SimpleDateFormat("H:mm");
                        for (int i = 2; i < rowParts.length; i++) {
                            DateTime departure = new DateTime(formatter.parse(rowParts[i]).getTime());
                            departures.add(departure);
                        }

                        if (day != null && stop != null) {
                            DailySchedule ds = new DailySchedule(day, stop, departures);

                            if (dailySchedules.containsKey(day)) {
                                dailySchedules.get(day).put(stop, ds);
                            } else {
                                Map<Stop, DailySchedule> stopsInDay = new HashMap<>();
                                stopsInDay.put(stop, ds);
                                dailySchedules.put(day, stopsInDay);
                            }
                        }
                    }
                }

                getSchedules().put(line, dailySchedules);
            }
        }
        return this;
    }

    public ScheduleData populateTrips() throws ParseException {
        for (Map.Entry<String, List<String>> entry : getFilesOnPath().entrySet()) {
            String fileName = entry.getKey();
            List<String> rows = entry.getValue();

            if (fileName.startsWith("plan")) {
                String[] lineParts = fileName.substring(4).split("-");

                LineType lineType = LineType.fromString(lineParts[0]);
                String lineId = lineParts[1].substring(0, lineParts[1].length() - 4);

                Line line = new Line(lineType, lineId);

                if (rows.size() != 1) {
                    throw new ParseException("We only support 1 trip yet", 0);
                }

                String row = rows.get(0);

                String[] parts1 = row.split("#");
                Stop start = getStops().get(parts1[0]);
                List<TripTarget> targets = new ArrayList<>();

                String[] parts2 = parts1[1].split("&");
                for (String targetString : parts2) {
                    // not the last bit
                    if (targetString.contains("@")) {
                        String[] targetParts = targetString.split("@");
                        Stop target = getStops().get(targetParts[0]);
                        Integer length = Integer.valueOf(targetParts[1]);
                        TripTarget tripTarget = new TripTarget(target, length);
                        targets.add(tripTarget);
                    }
                }

                getTrips().put(line, new Trip(start, targets));
            }
        }
        return this;
    }
}
