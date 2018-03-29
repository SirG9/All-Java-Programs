package com.chicho.java.datetime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;

public class GetLastHours {

	public static void main(String[] args) {
		System.out.println(getLastHours());
	}

	static String getLastHours() {
		Calendar newYearsDay = Calendar.getInstance();
		LocalTime lT = LocalTime.now();
		LocalDate lD = LocalDate.now();
		newYearsDay.set(lD.getYear(), lD.getMonthValue(), lD.getDayOfMonth(), lT.getHour(), lT.getMinute(),
				lT.getSecond());

		Calendar newYearsEve = Calendar.getInstance();
		newYearsEve.setTimeInMillis(newYearsDay.getTimeInMillis());
		newYearsEve.add(Calendar.HOUR, -1);

		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFormatter.format(newYearsEve.getTime());
	}

}
