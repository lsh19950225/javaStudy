package days02;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// [문제] 1~10 까지의 합을 출력
		// 1+2+3+4+5+6+7+8+9+10=55

		/*int sum = 0;
		for (int i = 0; i <= 10; i++) {
			System.out.printf("%d+", i);

			sum += i;	
		}
		System.out.printf("=%d\n", sum);*/

		/*int i = 1;
		int sum = 0;

		while (i<=10) {
			System.out.printf("%d+", i);
			sum+=i;
			i++;
		}
		System.out.printf("=%d\n", sum);*/

		/*int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i == 5) continue;
			System.out.printf("%d+", i);
			sum += i;
		}
		System.out.printf("=%d\n", sum);*/

		/*int i = 1;
		int sum = 0;
		while (i<=10) {
			if (i == 5) {
				i++;
				continue;
			}
			System.out.printf("%d+", i);
			sum+=i;
			i++;
		}
		System.out.printf("=%d\n", sum);*/

		/*int i = 0;
		int sum = 0;
		while (++i<=10) {
			if (i == 5) {
				continue;	
			}
			System.out.printf("%d+", i);
			sum+=i;		
		}
		System.out.printf("=%d\n", sum);*/
		
		Scanner scanner = new Scanner(System.in);
		int n;
		do {
			System.out.print("정수 ? ");
			n = scanner.nextInt();
		} while (n<1);
		
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.printf("%d+", i);
			sum+=i;
		}
		System.out.printf("=%d\n", sum);




	}

}
