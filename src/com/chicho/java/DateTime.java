package com.chicho.java.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTime {

	public static void main(String[] args) {

		LocalTime localTime = LocalTime.now();
		LocalDate localDate = LocalDate.now(ZoneId.of("GMT+05:30"));
		System.out.println(localDate + " " + localTime);
	}

}
