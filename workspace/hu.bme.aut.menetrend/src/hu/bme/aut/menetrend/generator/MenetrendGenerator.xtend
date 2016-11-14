/*
 * generated by Xtext 2.10.0
 */
package hu.bme.aut.menetrend.generator

import hu.bme.aut.menetrend.menetrend.AbsoluteSchedule
import hu.bme.aut.menetrend.menetrend.ComplexTimeEnd
import hu.bme.aut.menetrend.menetrend.ComplexTimeMiddle
import hu.bme.aut.menetrend.menetrend.DayType
import hu.bme.aut.menetrend.menetrend.RelativeSchedule
import hu.bme.aut.menetrend.menetrend.Schedule
import hu.bme.aut.menetrend.menetrend.SimpleTimeFormat
import hu.bme.aut.menetrend.menetrend.Stop
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MenetrendGenerator extends AbstractGenerator {

	private List<Stop> stops = new ArrayList<Stop>();
	private Map<String, List<Schedule>> schedules = new HashMap<String, List<Schedule>>();
		
	private def void processStop(Stop st) {
		stops.add(st);
	}

	private def void processSchedule(Schedule sch) {
		var key = sch.lineNumber.type + '-' + sch.lineNumber.number
		if (schedules.containsKey(key)) {
			schedules.get(key).add(sch);
		} else {
			var sList = new ArrayList<Schedule>();
			sList.add(sch);
			schedules.put(key, sList);
		}
	}

	private def dispatch format(List<Schedule> lSch) '''
		�var relatives = new ArrayList<RelativeSchedule>()�
		�var absolutes = new ArrayList<AbsoluteSchedule>()�
		�{ for (sch: lSch) {
			for (schedule: sch.scheduleParts) {
				if (schedule instanceof RelativeSchedule) {
					relatives.add(schedule)
				} else if (schedule instanceof AbsoluteSchedule) {
					absolutes.add(schedule)
				}
			}
		} ''}�
		�IF relatives.isEmpty || absolutes.isEmpty�
			 ERROR CODE 1 - Please provide relative schedule and absolute schedule too.
		�ELSE�
			�formatSchedule(relatives, absolutes)�
		�ENDIF�
	'''
	
	private def formatSchedule(List<RelativeSchedule> relatives, List<AbsoluteSchedule> absolutes) '''
		��� for all the days
		�FOR absolute : absolutes�	
			��� for all the routes
			�FOR relative : relatives�
				��� print the start 
				�formatOneStop(relative.start, absolute, 0)�
				��� print all the other stops
				�FOR relativeTarget : relative.targets�
					�formatOneStop(relativeTarget.target, absolute, relativeTarget.length)�
				�ENDFOR�
			�ENDFOR�
		�ENDFOR�
	'''
	
	private def formatOneStop(Stop target, AbsoluteSchedule absolute, int offset)'''
		�var row = new ArrayList<String>()�
		� {
			var formatter = new SimpleDateFormat("H:mm")
			var cal = Calendar.getInstance();
			row.add(target.name)
			for (departure : absolute.departures) {
				if (departure instanceof SimpleTimeFormat) {
					var fromDate = formatter.parse(departure.from)
					row.add(printTime(fromDate, offset, cal, formatter))
				} else if (departure instanceof ComplexTimeEnd) {
					var fromDate = formatter.parse(departure.from)
					row.add(printTime(fromDate, offset, cal, formatter))
					
					var untilDate = formatter.parse(departure.until) 
					row.addAll(assembleComplex(fromDate, untilDate, offset, departure.frequency, cal, formatter))
				} else if (departure instanceof ComplexTimeMiddle) {
					var fromDate = formatter.parse(departure.from)
					row.add(printTime(fromDate, offset, cal, formatter))

					var untilDate = formatter.parse(departure.until) 
					row.addAll(assembleComplex(fromDate, untilDate, offset, departure.frequency, cal, formatter))						
				}
			}
			
		''}�
		�IF absolute.daytype == DayType.WEEKDAYS�
			�DayType.MONDAY��FOR item : row�;�item��ENDFOR�
			�DayType.TUESDAY��FOR item : row�;�item��ENDFOR�
			�DayType.WEDNESDAY��FOR item : row�;�item��ENDFOR�
			�DayType.THURSDAY��FOR item : row�;�item��ENDFOR�
			�DayType.FRIDAY��FOR item : row�;�item��ENDFOR�
		�ELSEIF absolute.daytype == DayType.WEEKENDS�
			�DayType.SATURDAY��FOR item : row�;�item��ENDFOR�
			�DayType.SUNDAY��FOR item : row�;�item��ENDFOR�
		�ELSE�
			�absolute.daytype��FOR item : row�;�item��ENDFOR�
		�ENDIF�
	'''
	
	private def dispatch format(Stop st) '''�st.name�'''
	
	private def String printTime(Date date, int offset, Calendar cal, SimpleDateFormat formatter) {
		cal.setTime(date)
		cal.add(Calendar.MINUTE, offset)
		return formatter.format(cal.getTime())
	}
	
	private def List<String> assembleComplex(Date from, Date until, int offset, int frequency, Calendar cal, SimpleDateFormat formatter) {
		var times = new ArrayList<String>()		
		cal.setTime(until)
		cal.add(Calendar.MINUTE, offset)
		
		var untilOff = cal.time
		cal.setTime(from)
		cal.add(Calendar.MINUTE, offset)
		
		while (cal.time < untilOff) {
			cal.add(Calendar.MINUTE, frequency)
			times.add(formatter.format(cal.getTime()))
		}		
		
		return times
	}

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		// �jabb gener�l�sok k�zt ugyanazt a p�ld�nyt haszn�lja
		stops.clear
		schedules.clear
		
		resource.allContents.filter(typeof(Stop)).forEach[st|st.processStop]
		resource.allContents.filter(typeof(Schedule)).forEach[sch|sch.processSchedule]
		
		fsa.generateFile('stops.csv', stops.map[st|st.format].join(';'));
		
		for (scheduleEntry : schedules.entrySet) {
			fsa.generateFile('schedule' + scheduleEntry.key + '.csv', format(scheduleEntry.value))
		}
		
	}
}