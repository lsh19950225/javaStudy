package days18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex03_02 {

	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.now();
		// System.out.println(ld.toString()); // 2024-07-24
		LocalDate ld2 = LocalDate.of(2024, 7, 24);
		System.out.println(ld2);
		
		
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		LocalTime lt2 = LocalTime.of(12, 16, 32);
		System.out.println(lt2);
		
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		LocalDateTime ldt2 = LocalDateTime.of(ld, lt);
		System.out.println(ldt2);
		
	} // main

} // class
