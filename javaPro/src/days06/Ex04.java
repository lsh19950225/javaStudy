package days06;

import java.util.Scanner;

/**
 * @author lsh
 * @date 2024. 7. 8. - 오후 12:18:30
 * @subject 제어문, 배열 활용
 * @content
 *
 */
public class Ex04 {

	public static void main(String[] args) {

		// 세 정수(a, b, c)를 입력받아서 max, min 출력

		int a, b, c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("세 정수 입력 ? ");

		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();

		/*
	      int max = a > b ?  a : b;
	      max =  max > c ? max : c;

	      int min = a > b ? ( b > c? c: a): ( a > c ? c : a );
		 */
		int max = Math.max( Math.max(a, b), c);

		int abMin = Math.min(a, b);
		int min = Math.min( c , abMin);











	} // main

} // class
