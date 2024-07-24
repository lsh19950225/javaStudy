package days18;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author lsh
 * 	@date 2024. 7. 24. - 오전 10:36:27
 * @subject		형식화(format) 클래스
 *	@content		1. SimpleDateFormat
 *						2. DecimalFormat
 *						3. ChoiceFormat
 *						4.	MessageFormat
 * 
 */
public class Ex02 {

	public static void main(String[] args) throws ParseException {
		/* 1.
		Calendar c = Calendar.getInstance();
		Date d = c.getTime();
		
		// 간편한 날짜 형식 : SimpleDateFormat
		String pattern = "yyyy.MM.dd (E) hh:mm:ss"; // E : 월, EEE : 월요일
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String s = sdf.format(d);
		System.out.println(s);
		*/
		
		//String s = "2024.07.24 (수)";
		/*
		String s = "2024/07/24";
		Date d = new Date(s);
		System.out.println(d.toLocaleString());
		*/
		
		
		String s = "2024.07.24 (수)";
		String pattern = "yyyy.MM.dd (E)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date d = sdf.parse(s);
		System.out.println(d.toLocaleString());
		
		
		// Date d -> Calendar c 변환 코딩
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		
	} // main

} // class
