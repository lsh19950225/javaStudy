package days18;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Set;
import java.util.function.ToDoubleBiFunction;

public class Ex01 {

	public static void main(String[] args) {
		/*
		입력 #1

		aBcDeFg
		출력 #1

		AbCdEfG
		*/

		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();

		char [] aArr = a.toCharArray();

		for (int i = 0; i < aArr.length; i++) {
			if (i%2 == 0) {
				aArr[i] -= 32;
			}
			else {
				aArr[i] += 32;
			}
		}
		System.out.println(Arrays.toString(aArr));
		

		/*4. 설문조사 기간이 
		   시작일  2024.7.20  00:00:00
		   종료일  2024.7.24  00:00:00
		   일 때  오늘 현재 설문이 가능/불가능한지를 체크해서 출력하세요.

		Date dDay = new Date( 2024-1900, 7-1, 24, 9, 0, 0);
		System.out.println(dDay.toLocaleString());

		Date start = new Date(2024-1900, 7-1, 20, 0, 0, 0);
		Date end = new Date(2024-1900, 7-1, 24, 0, 0, 0);

		if (start.getTime() > dDay.getTime()) {
			System.out.println("불가능");
		} else if (end.getTime() < dDay.getTime()) {
			System.out.println("불가능");
		} else {
			System.out.println("가능");
		}*/

		/*3. 수료일(2024.12.14. 18:00:00)로 부터 오늘까지 남은 일수 계산을 하세요.

		Date dDay = new Date( 2024-1900, 7-1, 24, 9, 0, 0);

		System.out.println(dDay.toLocaleString());

		Date end = new Date(2024-1900, 12-1, 14, 18, 0, 0);

		System.out.println(end.toLocaleString());

		long daying = end.getTime() - dDay.getTime();

		System.out.println(daying/1000/60/60/24 + "일");*/

		/*1.  년도 year를 입력받아서 
	    입력받은 년도의 1월~12월 까지의 마지막 날짜를 출력하는 코딩을 하세요. 
	    ( 조건 : Date 클래스 사용 )
	    ( 조건 : Scanner 클래스 사용 + try~with~resource문 사용)

	    실행결과 예제)
	    2005년 

		1월 : 31일
		2월 : 28일
		3월 : 31일
		4월 : 30일
		5월 : 31일
		6월 : 30일
		7월 : 31일
		8월 : 31일
		9월 : 30일
		10월 : 31일
		11월 : 30일
		12월 : 31일*/

		int year = 2024;
		System.out.println(year +"년");
		
		for (int i = 1; i <= 12; i++) {
			int lastDay = getLastDay(year, i);
			System.out.printf("%d월 : %d일\n",i,lastDay);
		}
		
		



	} // main

	private static int getLastDay(int year, int month) {
		
//		Calendar c = Calendar.getInstance();
//		c.set(Calendar.YEAR, year);
//		c.set(Calendar.MONTH, month-1);
//		c.set(Calendar.DATE, 1);
		
		Calendar c = new GregorianCalendar(year, month-1, 1);
		return c.getActualMaximum(Calendar.DATE);
		
		
	}
	
} // class
