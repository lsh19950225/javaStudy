package days03;

import java.util.Scanner;

/**
 * @author lsh
 * @date 2024. 7. 3. - 오후 4:30:08
 * @subject 
 * @content
 *
 */
public class Ex05_05 {

	public static void main(String[] args) {

		/*int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		//                       1            7            0.1       
		double result = apple - number*pieceUnit;
		System.out.println("사과 1개에서 남은 양: " + result);*/

		// 두 문자열을 비교할 때는 비교 연산자를 사용하지말라


		// 대입연산자 =
		// int x = 100;
		// int y = x;

		// [부호연산자]
		// +3
		// -3

		// [증감연산자]
		// [쉬프트연산자]
		// [복합대입연산자]
		// [삼항연산자 == 조건연산자]
		// [instanceof 비교연산자] x

		String n1 = "kenik", n2;

		Scanner scanner = new Scanner(System.in);

		System.out.print("> n2 입력 ? ");
		n2 = scanner.next();

		System.out.println( n1 == n2 );  // false
		System.out.println( n1.equals(n2) ); // true
		System.out.println( n1.equalsIgnoreCase(n2) ); // true

		System.out.println( n1 != n2 );  // false
		System.out.println( !n1.equals(n2) ); // true
		
		// 우선순위 기억 : & > ^ > | >  &&   > ||

		/*
	      int x = 10;
	      int y = 10;
	      int z = 10;

	      int x = 10, y = 10, z = 10;

	      int x, y, z;
	      // <-----
	      x=y=z=10;
		 */




	}

}
