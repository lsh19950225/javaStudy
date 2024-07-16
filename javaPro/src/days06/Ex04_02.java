package days06;

import java.util.Scanner;

/**
 * @author lsh
 * @date 2024. 7. 8. - 오후 12:18:30
 * @subject 제어문, 배열 활용
 * @content
 *
 */
public class Ex04_02 {

	public static void main(String[] args) {

		// 다섯 정수(a, b, c, d, e)를 입력받아서 max, min 출력

		int a, b, c, d, e;
		Scanner scanner = new Scanner(System.in);
		System.out.println("다섯 정수 입력 ? ");

		a = (int) (Math.random()*100)+1; // 1<=  <=100
		b = (int) (Math.random()*100)+1;
		c = (int) (Math.random()*100)+1;
		d = (int) (Math.random()*100)+1;
		e = (int) (Math.random()*100)+1;
		
		 System.out.printf("a=%d,b=%d,c=%d,d=%d,e=%d\n", a,b,c,d,e);

	      int max = Math.max(a, b);
	      max = Math.max(max, c);
	      max = Math.max(max, d);
	      max = Math.max(max, e);

	      System.out.printf("max=%d\n", max);












	} // main

} // class
