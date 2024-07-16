package days02;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Ex18 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n, m;
		int sum = 0;
		System.out.print("두 정수 nm ? ");
		n = scanner.nextInt();
		m = scanner.nextInt();

		/*if (m > n) {
			for (int i = n; i <= m;  i++) {
				System.out.printf("%d+", i);
				sum += i;
			}
		} else {
			for (int i = m; i <= n;  i++) {
				System.out.printf("%d+", i);
				sum += i;
			}
		}*/


		/*if( n > m ){
			int temp = n;
			n = m;
			m = temp;
		}
		for (int i = n; i <= m;  i++) {
			System.out.printf("%d+", i);
			sum += i;
		}*/


		int min = n > m ? m : n;  // Math.min(n,m)
		int max = Math.max(n, m);
		for (int i = min; i <= max;  i++) {
			System.out.printf("%d+", i);
			sum += i;
		}



		System.out.printf("=%d\n", sum );

	}
} 
