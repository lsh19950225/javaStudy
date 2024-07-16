package days06;

import java.io.IOException;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		// 한 문자를 입력받아서 출력
		// bufferedReader, Scanner 클래스 "A" -> charAt(); -> 'A'
		// System.in
		char one;
		System.out.print("한 문자 입력 ? ");
		//int nextByte = System.in.read();
		//System.out.println(nextByte); // 'A' 65
		one = (char) System.in.read();
		System.out.println(one);
		
		//System.in.read(); // \n : 13
		//System.in.read(); // \r : 10
		System.in.skip( System.in.available() );
		
		// 복 붙
		System.out.print("한 문자 입력 ? ");
		one = (char) System.in.read();
		System.out.println(one);
		
		//
		
		









	} // main

} // class
