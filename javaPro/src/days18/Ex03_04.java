package days18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Ex03_04 {

	public static void main(String[] args) {
		// String 불변
		String a = "xyz";
		
		String b = a.replace('y', '와');
		System.out.println(b);
		
		// j.t 핵심클래스 불변
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		// 1. with(), withXXX()
		ld = ld.withYear(2020);
		System.out.println(ld);
		
		ld = ld.with(ChronoField.YEAR, 2024);
		System.out.println(ld);
		// 월 12 수정
		ld = ld.withMonth(5);
		System.out.println(ld);
		ld = ld.with(ChronoField.MONTH_OF_YEAR, 12);
		System.out.println(ld);
		
		// 5달 빼기, 더하기
		ld = ld.minusMonths(5);
		System.out.println(ld);
		ld = ld.plusMonths(5);
		System.out.println(ld);
		
		// truncatedTo() 절삭하다, 끝을 잘라내다.
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		// 시간 보다 작은 단위를 모두 절삭.
		// lt = lt.truncatedTo(ChronoUnit.HOURS);
		lt = lt.truncatedTo(ChronoUnit.MINUTES); // 절삭할 단위
		System.out.println(lt);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		dt = dt.truncatedTo(ChronoUnit.DAYS);
		System.out.println(dt);
		
	} // main

} // class
