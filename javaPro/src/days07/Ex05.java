package days07;

/**
 * @author lsh
 * @date 2024. 7. 9. - 오후 3:08:39
 * @subject
 * @content
 *
 */
public class Ex05 {

	public static void main(String[] args) {

		// 계차수열
		// term 1+2+4+7+11+16+22+29 ... 항의 갯수가 20개 까지의 합


		int term = 1;
		int di = 0;
		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			term += di;
			System.out.printf("%d+", term);
			di++;
			sum += term;
		}
		System.out.printf("=%d\n", sum);

		// 중요x
		/*(n^2-n)/2+1
		for (int i = 1; i <= 20 ; i++) {
			term = (int) ((Math.pow(i, 2)-i)/2+1);
			System.out.printf("%d+", term);
		}*/








	} // main

} // class
