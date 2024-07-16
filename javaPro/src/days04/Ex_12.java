package days04;

import java.util.Scanner;

/**
 * @author lsh
 * @date 2024. 7. 4. - 오후 5:10:44
 * @subject
 * @content
 *
 */
public class Ex_12 {

	public static void main(String[] args) {
		// 1. 국어점수를 입력받아서 수/우/미/양/가 출력(if문)
		// 2. 국어점수를 입력받아서 수/우/미/양/가 출력(switch문)
		// 3. 1~10까지의 홀수의 합(for문)
		// 4. 1~10까지의 홀수의 합(while문)
		// 5. 두 정수(n,m)을 입력받아서 두 정수 사이의 합을 출력(for문, while문)

		Scanner scanner = new Scanner(System.in);
		int n;
		do {
			System.out.println("정수(n) 입력 ? ");
			n = scanner.nextInt();
		} while (n<1);


		int sum = 0;
		for (int i = 1; i <= n; i++) {
			// 1~10까지의 합
			System.out.printf("%d+",i);
			sum += i;

		}
		System.out.printf("=%d",sum);
		


	} // main

} // class
