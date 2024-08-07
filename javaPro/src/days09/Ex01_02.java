package days09;

import java.util.Calendar;
import java.util.Date;

/**
 * @author lsh
 * @date 2024. 7. 11. - 오후 12:06:52
 * @subject
 * @content
 *
 */
public class Ex01_02 {

	public static void main(String[] args) {
		
		// 1. 요일
		// 2. 마지막 날짜
		// Calendar 클래스 사용.
		Calendar c = Calendar.getInstance();
		c.set(2020, 5-1, 1); // : 월은 -1
		System.out.println( c );
		System.out.println( c.get(Calendar.DAY_OF_WEEK) );
		
		int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println( lastDay );
		
		
		
		
		
		
		
		
		/*
		//  Date 클래스 사용
		// Date : java.uitl 로
		Date d = new Date(2022-1900, 7-1, 1); // -1900, -1 해줘야됨. : 정해진 것.
		System.out.println(d.toLocaleString()); // 취소선 : 사라질 메서드라는 뜻이며, 오늘 날짜와 시간정보를 알려줌.
		
		int dayOfWeek = d.getDay(); // 내부에 배열요소 0부터
		System.out.println(dayOfWeek);
		
		                // 날짜 d의 월을 가져옴.
		d.setMonth( d.getMonth()+1 ); // 월을 내가 set(설정)
		//System.out.println(d.toLocaleString());
		
		d.setDate( d.getDate()-1 );
		//System.out.println(d.toLocaleString());
		
		//System.out.println(d.getDate());
		
		int lastDay = d.getDate();
		*/
		
		
		
		

	} // main

} // class
