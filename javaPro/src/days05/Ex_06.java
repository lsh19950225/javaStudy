package days05;

import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {
		// 5. 두 정수(n,m)을 입력받아서 두 정수 사이의 합을 출력(for문, while문)

		/*Scanner scanner = new Scanner(System.in);
		int n, m;
		System.out.print("두 정수nm 입력 ? ");
		n = scanner.nextInt();
		m = scanner.nextInt();

		if (m>n) {
			for (int i = n; i <=m; i++) {

				System.out.printf("%d+", i);
				sum+=i;

			} else {
				for (int i = m; i <=n; i++) {

					System.out.printf("%d+", i);
					sum+=i;
				}

				int sum = 0;
			}*/


		/*2. temp 이용 : 강사님
		 * int sum = 0;


		for (int i = n; i <=m; i++) {

			System.out.printf("%d+", i);
			sum+=i;
			System.out.printf("=%d\n", sum);*/

		// 3. 풀이
		/*int sum = 0;
		int min = n > m ? m : n;
		int max = Math.max(n, m);
		
		for (int i = min; i <=max; i++) {

			System.out.printf("%d+", i);
			sum+=i;
		}*/




	} // main




} // class
