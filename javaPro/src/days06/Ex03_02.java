package days06;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Ex03_02 {

	public static void main(String[] args) {
		
		// if ( one == '#' || one == '@' || one == '$' || one == '!' ) {}
		
		// 정규 표현식(regex) 유효성 검사. regular expression
		
		char one;
		String strOne;
		Scanner scanner = new Scanner(System.in);
		System.out.print("한 문자 입력 ? ");
		strOne = scanner.next();
		
		// String regex = "[0-9]"; // \d
		// String regex = "[A-Z]";
		// String regex = "[a-z]";
		// String regex = "[가-힣]";
		// String regex = "[A-Za-z]";
		// 강사님 참고
		
		String regex = "[aeiouAEIOU]";
		System.out.println( strOne.matches(regex) );


		
		
		
		
		
		
		
		

	} // main

} // class
