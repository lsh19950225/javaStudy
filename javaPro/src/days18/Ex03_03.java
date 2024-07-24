package days18;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

/**
 * @author lsh
 * 	@date 2024. 7. 24. - 오후 12:26:56
 * @subject
 *	@content
 * 
 */
public class Ex03_03 {

	public static void main(String[] args) {
		/*
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		// 년
		// int year = ld.get(ChronoField.YEAR);
		int year = ld.getYear();
		System.out.println(year);
		// 월
		int month = ld.get(ChronoField.MONTH_OF_YEAR);
		System.out.println(month);

		Month emonth = ld.getMonth();
		System.out.println(emonth);

		// 일
		int date = ld.get(ChronoField.DAY_OF_MONTH);
		System.out.println(date);

		date = ld.getDayOfMonth();
		System.out.println(date);
		 */
		
		/*
		LocalTime lt = LocalTime.now();
		//시
		//int h = lt.getHour();
		int h = lt.get(ChronoField.HOUR_OF_DAY);
		System.out.println(h);
		//분
		int m = lt.get(ChronoField.MINUTE_OF_HOUR);
		// int m = lt.getMinute();
		System.out.println(m);
		//초
		int s = lt.get(ChronoField.SECOND_OF_MINUTE);
		// int s = lt.getSecond();
		System.out.println(s);
		//ms
		int ms = lt.getNano();
		System.out.println(ms);
		*/
		
		/*
		// 요일
		int dof = ld.get(ChronoField.DAY_OF_WEEK);
		System.out.println(dof ); //  월(1) ~ 일(7)
		//                   			  Date   일(0) ~ 토(6)
		//                  		Calendar  일(1) ~ 토(7)

		DayOfWeek edow  = ld.getDayOfWeek();
		System.out.println( edow ); // MONDAY
		System.out.println( edow.getValue() ); // 1

		LocalTime lt = LocalTime.now();
		// 시간
		int hour = lt.get(ChronoField.HOUR_OF_DAY);
		System.out.println( hour );

		hour = lt.getHour();
		System.out.println( hour );

		// 분
		int m = lt.get(ChronoField.MINUTE_OF_HOUR);
		System.out.println( m );

		m = lt.getMinute();
		System.out.println( m );
		// 초
		int s = lt.get(ChronoField.SECOND_OF_MINUTE);
		System.out.println(s );

		s = lt.getSecond();
		System.out.println(s );
		// 밀리초
		int ms = lt.get(ChronoField.MILLI_OF_SECOND);
		System.out.println(ms);

		int ns = lt.getNano();
		System.out.println( ns );
		*/
		
	} // main

} // class
