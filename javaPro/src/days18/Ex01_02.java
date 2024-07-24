package days18;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ex01_02 {

	public static void main(String[] args) {
		// Date 클래스
		// Calendar 클래스
		
		int year = 2024;
		int month = 6;
		int date = 1;

		// 0(일요일) ~ 6(토요일)
		int dayOfWeek = getDayOfWeek(year,month,date); // 1(월)
		int lastDay = getLastDay(year,month);

		// 24.6.30(시작날짜) ~ 42일
		Calendar start = new GregorianCalendar(year, month-1, 1);
		start.add(Calendar.DATE, -dayOfWeek);
		
		// Calendar -> Date 형변환
		// Date -> Calendar 형변환
		Date sd = start.getTime();
		//System.out.println(sd.toLocaleString());
		
		// System.out.println(start.toLocaleString());
		
		System.out.println("=".repeat(22));
		System.out.println("=".repeat(22));
		for (int i = 1; i <= 42; i++) {
			// System.out.println(start.toLocaleString());
			int cmonth = start.get(Calendar.MONTH) +1;
			if ( cmonth == month+1 ) System.out.printf("[%d]\t", start.get(Calendar.DATE));
			else if ( cmonth == month-1 ) System.out.printf("(%d)\t", start.get(Calendar.DATE));
			else System.out.printf("%d\t", start.get(Calendar.DATE));

			if(i%7==0) System.out.println();
			start.add(Calendar.DATE, 1);
		}
		System.out.println();
		System.out.println("=".repeat(22));
		
	} // main

	private static int getLastDay(int year, int month) {

		Calendar c = new GregorianCalendar(year, month-1, 1);
		return c.getActualMaximum(Calendar.DATE);

	}

	/*private static int getLastDay(int year, int month) {

		//		Calendar c = Calendar.getInstance();
		//		c.set(Calendar.YEAR, year);
		//		c.set(Calendar.MONTH, month-1);
		//		c.set(Calendar.DATE, 1);

		Calendar c = new GregorianCalendar(year, month-1, 1);
		return c.getActualMaximum(Calendar.DATE);*/

		private static int getDayOfWeek(int year, int month, int date) {

			Calendar c = new GregorianCalendar(year, month-1, 1);

			return c.get(Calendar.DAY_OF_WEEK) -1;
		}

	} // class