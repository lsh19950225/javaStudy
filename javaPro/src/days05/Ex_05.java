package days05;

import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {

		// 1. 국어점수를 입력받아서 수/우/미/양/가 출력(if문)
		// 2. 국어점수를 입력받아서 수/우/미/양/가 출력(switch문)
		// 3. 1~10까지의 홀수의 합(for문)
		// *** 4. 1~10까지의 홀수의 합(while문)
		// 5. 두 정수(n,m)을 입력받아서 두 정수 사이의 합을 출력(for문, while문)
		
		// 홀
		int sum = 0;
		int i = 1;
		while (i<=10) {     // 1<=10 참
			if (i%2 == 0) {  // 2%2==0 참
				i++; // 이게 필요
				continue;
			} // if
			System.out.printf("%d+", i);  // 1+
			sum += i; // sum = 1
			i++;         // i=2
		} // while
		System.out.printf("=%d\n", sum);
		
		
		
		
		/*int sum = 0;
		int i = 1;
		while (i<=10) {
			System.out.printf("%d+", i);
			sum += i;
			i++;
		} // while
		System.out.printf("=%d\n", sum);*/


	} // main

}// class
