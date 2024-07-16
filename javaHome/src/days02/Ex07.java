package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String name;
		int age;
		char grade;
		
		System.out.print("이름 ? ");
		name = bufferedReader.readLine();
		System.out.print("나이 ? ");
//		age = (int) bufferedReader.readLine(); : 안됨
		age = Integer.parseInt(bufferedReader.readLine());
		System.out.print("등급 ? ");
		String strGrade = bufferedReader.readLine();
		grade = strGrade.charAt(0);
		grade = bufferedReader.readLine().charAt(0);
		
		System.out.printf("이름=\"%s\", 나이=%d살, 등급='%c'\n", name, age);
		
//		System.out.println(3+5+'0');
		
		

	}

}
