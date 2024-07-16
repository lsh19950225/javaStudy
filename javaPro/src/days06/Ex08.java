package days06;

public class Ex08 {

	public static void main(String[] args) {

		// [순서도]
		// 1-2+3-4...-8+9-10=-5
		// 홀수 sum += i      %d-
		// 짝수 sum -= i       %d+
		//1번 풀이
		/*int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i%2==0) {
				System.out.printf("%d-", i);
				sum -= i;
			} else {
				System.out.printf("%d+", i);
				sum+=i;
			}

		}
		System.out.printf("=%d\n", sum);*/

		//2번 풀이
		/*int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.printf(i%2==0?"%d+":"%d-", i);
			sum += i%2 == 0?-i:i;
		}*/

		//3번 풀이 시험
		int sum = 0;
		boolean sw = false;
		for (int i = 1; i <= 10; i++) {
			if (!sw) {
				System.out.printf("%d-", i);
				sum+=i;
			} else {
				System.out.printf("%d+", i);
				sum+=i;
			}
			sw = !sw;

		}
		



	} // main

} // class
