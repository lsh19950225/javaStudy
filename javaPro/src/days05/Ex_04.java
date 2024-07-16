package days05;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {

		// 1. 국어점수를 입력받아서 수/우/미/양/가 출력(if문)
		// 2. 국어점수를 입력받아서 수/우/미/양/가 출력(switch문)
		// *** 3. 1~10까지의 홀수의 합(for문)
		// 4. 1~10까지의 홀수의 합(while문)
		// 5. 두 정수(n,m)을 입력받아서 두 정수 사이의 합을 출력(for문, while문)

		/*int sum = 0;
		for (int i = 1; i <= 10; i+=2) {
			if (i%2 == 1) {
				System.out.printf("%d+", i);
				sum+=i;
			}

		} // for
		System.out.printf("=%d\n", sum);*/

		int sum = 0;
		for (int i = 1; i <=10;  i++) {
			if (i%2 == 0) {System.out.printf("%d+", i);
			sum+=i;
			} // if

		} // for
		System.out.printf("=%d\n", sum);

		/*int sum = 0;

		for (int i = 1; i <= 10; i+=1) {
			System.out.printf("%d+", i);
			sum+=i;

		}
		System.out.printf("=%d", sum);*/






	} // main

}// class
