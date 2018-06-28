package br.com.dicasdejava.util;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class ConverterLocalDateParaDate {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.of(2018, 6, 28);
		System.out.println("LocalDate = " + localDate);

		Date date1 = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
		System.out.println("Date      = " + date1);

		localDate = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		System.out.println("LocalDate = " + localDate);

	}
}
