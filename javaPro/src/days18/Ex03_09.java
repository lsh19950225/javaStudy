package days18;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Ex03_09 {

	public static void main(String[] args) {
		
		// Period = 날짜 - 날짜
		// Duration = 시간 - 시간
		// 예) 수료일 - 오늘날짜 = 날짜 간격 ?
		
		LocalDate ed = LocalDate.of(2024,12,14);
		ed = ed.plusDays(1);
		LocalDate td = LocalDate.now();
		
		Period p = Period.between(td, ed);
		System.err.println(p); // P4M21D 4달 21일
		System.out.println(p.getYears());
		System.out.println(p.getMonths());
		System.out.println(p.getDays());
		
		// 18:00 퇴근
		
		LocalTime et = LocalTime.of(18, 0);
		System.out.println(et);
		LocalTime tt = LocalTime.now();
		
		Duration d = Duration.between(tt, et);
		System.out.println(d); // PT2H46M5.4866305S
		System.out.println(d.getNano());
		System.out.println(d.getSeconds()/60);
		System.out.println(d.getSeconds()/60/60);
		System.out.println(d.getSeconds()/60/60);
		
		
		
		
		
		
		
		
		
		
		
		
		
		LocalDateTime today = LocalDateTime.now();
		LocalDateTime start = LocalDateTime.of(2023,8,10,9,0,0);
		LocalDateTime end = LocalDateTime.of(2023,8,15,18,0,0);
		Duration day = Duration.between(start, end);
		System.out.println(day);

		
	} // main

} // class
