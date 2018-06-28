package br.com.dicasdejava.util;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class ConverterLocalDateTimeParaDate {

	public static void main(String[] args) {

		LocalDateTime localDate = LocalDateTime.of(2018, 6, 28, 19, 18);
		System.out.println("LocalDateTime = " + localDate);

		Date date1 = Date.from(localDate.atZone(ZoneId.systemDefault()).toInstant());
		System.out.println("Date          = " + date1);

		localDate = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
		System.out.println("LocalDateTime = " + localDate);

	}
}
