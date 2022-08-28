package com.cg.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Time_Formate2 {

	public static void main(String[] args) {
		LocalDateTime datetime=LocalDateTime.now();
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		String var=datetime.format(df);
		System.out.println(var);
	}

}
