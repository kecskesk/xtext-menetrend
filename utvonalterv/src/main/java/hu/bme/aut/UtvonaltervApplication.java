package hu.bme.aut;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import java.io.IOException;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

import java.io.StringWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UtvonaltervApplication {

    private static final Logger LOG = LoggerFactory.getLogger(UtvonaltervApplication.class);

    public ScheduleData scheduleData;

    public UtvonaltervApplication() {
        try {
            scheduleData = new ScheduleData()
                    .loadFiles()
                    .populateStops()
                    .populateSchedules()
                    .populateTrips();
        } catch (IOException | ParseException e) {
            LOG.error(e.getMessage(), e);
        }
    }

    public static void main(String[] args) {
        UtvonaltervApplication app = new UtvonaltervApplication();

        final Configuration configuration = new Configuration();
        configuration.setClassForTemplateLoading(UtvonaltervApplication.class, "/");

        Map<String, Object> homePageVariables = new HashMap<>();
        homePageVariables.put("message", "Welcome to the home page");
        app.addPage(configuration, "/", "templates/home.ftl", homePageVariables);

        Map<String, Object> linePageVariables = new HashMap<>();
        linePageVariables.put("lines", app.scheduleData.getSchedules());
        app.addPage(configuration, "/lines", "templates/lines.ftl", linePageVariables);

        Map<String, Object> stopPageVariables = new HashMap<>();
        stopPageVariables.put("stops", app.scheduleData.getStops());
        app.addPage(configuration, "/stops", "templates/stops.ftl", stopPageVariables);

        Map<String, Object> tripPageVariables = new HashMap<>();
        tripPageVariables.put("trips", app.scheduleData.getTrips());
        app.addPage(configuration, "/trips", "templates/trips.ftl", tripPageVariables);

        Map<String, Object> plannerPageVariables = new HashMap<>();
        plannerPageVariables.put("stops", app.scheduleData.getStops());
        plannerPageVariables.put("days", Day.values());
        plannerPageVariables.put("lines", app.scheduleData.getSchedules());
        app.addPage(configuration, "/planner", "templates/planner.ftl", plannerPageVariables);

        app.postHandler(configuration, "/plan_result", "templates/plan_result.ftl");
    }

    private void postHandler(final Configuration configuration, String route, String templateName) {
        Spark.post(new Route(route) {
            @Override
            public Object handle(final Request request, final Response response) {
                String from = request.queryParams("from");
                String to = request.queryParams("to");
                String day = request.queryParams("day");
                String hour = request.queryParams("hour");
                String minute = request.queryParams("minute");

                Map<String, Object> pageVariables = new HashMap<>();

                pageVariables.put("from", from);
                pageVariables.put("to", to);
                pageVariables.put("day", day);
                pageVariables.put("hour", hour);
                pageVariables.put("minute", minute);

                SimpleDateFormat formatter = new SimpleDateFormat("H:mm");
                Date planDate;
                try {
                    planDate = formatter.parse(hour + ":" + minute);
                    DateTime planTime = new DateTime(planDate);

                    PlanParams planParams = new PlanParams();
                    planParams.setFrom(scheduleData.getStops().get(from));
                    planParams.setTo(scheduleData.getStops().get(to));
                    planParams.setDay(Day.fromString(day));
                    planParams.setAt(planTime);
                    
                    Planner planner = new Planner(planParams, scheduleData);
                    String result = planner.calculateRoute();
                    pageVariables.put("result", result);
                    StringWriter writer = new StringWriter();
                    try {
                        Template pageTemplate = configuration.getTemplate(templateName);
                        pageTemplate.process(pageVariables, writer);
                    } catch (IOException | TemplateException e) {
                        halt(500);
                        LOG.error(e.getMessage(), e);
                    }
                    return writer;
                } catch (ParseException ex) {
                    LOG.error(ex.getMessage(), ex);
                    return "Cant parse date.";
                }
            }
        });
    }

    private void addPage(final Configuration configuration, String route, String templateName, Map<String, Object> pageVariables) {
        Spark.get(new Route(route) {
            @Override
            public Object handle(final Request request, final Response response) {
                StringWriter writer = new StringWriter();
                try {
                    Template pageTemplate = configuration.getTemplate(templateName);
                    pageTemplate.process(pageVariables, writer);
                } catch (IOException | TemplateException e) {
                    halt(500);
                    LOG.error(e.getMessage(), e);
                }
                return writer;
            }
        });
    }
}
