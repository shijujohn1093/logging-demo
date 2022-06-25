package com.thengara.loggingdemo;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.TimeZone;

import org.joda.time.DateTime;

public class TestDateTime {
	public static void main(String[] args) {
//		for(String zone : ZoneId.getAvailableZoneIds()) {
//			System.out.println(zone);
//		}
		TimeZone tzone = TimeZone.getTimeZone("Europe/London");
		TimeZone.setDefault(tzone);

		System.out.println("1 --------Instant--------------------");
		System.out.println("Hello Worlds !!");
		Instant instant = Instant.now(); // Capture the current moment in UTC.
		System.out.println(instant);
		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println(zoneId);

		System.out.println("2 --------Util Date------------------------");
		Date utilDate = new Date();
		System.out.println(utilDate);

		System.out.println("3 --------LocalDate LocalTime ------------------------");

		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		LocalDateTime currentDateAndTime = LocalDateTime.now();
		System.out.println(currentDateAndTime);

		System.out.println("3 --------Joda date time of java java.time ------------------------");

		System.out.println("3 --------ZonedDateTime India----------");
		ZoneId z = ZoneId.of("Asia/Calcutta");
		ZonedDateTime zdt = ZonedDateTime.now(z);
		System.out.println(zdt);
		System.out.println("3 --------ZonedDateTime London----------");
		ZoneId lz = ZoneId.of("Europe/London");
		ZonedDateTime lzdt = ZonedDateTime.now(lz);
		System.out.println(lzdt);

		System.out.println("5 --------UTC ZonedDateTime----------");
		ZoneId utcZoneId = ZoneId.of("UTC");
		ZonedDateTime utcZdt = ZonedDateTime.now(utcZoneId);
		System.out.println(utcZdt);

		System.out.println("6 --------GMT ZonedDateTime----------");
		ZoneId gmtZoneId = ZoneId.of("GMT+05:30"); // Zone id and offset
		ZonedDateTime gmtZdt = ZonedDateTime.now(gmtZoneId);
		System.out.println(gmtZdt);
		/**
		 * Instance if Java util Date will always create object of time same as system,
		 * unless we set default timezon
		 */

		System.out.println("6 --------Joda Datetime----------");
		DateTime jodaDateTime = new DateTime();
		System.out.println("Joda DateTime =>"+jodaDateTime);
		Date utilDate2 = new Date(jodaDateTime.getMillis());
		System.out.println("Util Date from Joda =>"+  utilDate2);

		// https://stackoverflow.com/questions/34222227/how-to-use-joda-time-with-maven
		// https://www.oracle.com/technical-resources/articles/java/jf14-date-time.html
		// https://www.timeanddate.com/time/zone/uk/london
		// https://www.tecmint.com/check-linux-timezone/
		// https://www.timeanddate.com/time/zone/uk/london
		// https://www.timeanddate.com/time/change/uk/london
	}
}
