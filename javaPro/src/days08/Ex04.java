package days08;

/**
 * @author lsh
 * @date 2024. 7. 10. - 오후 4:13:22
 * @subject
 * @content
 *
 */
public class Ex04 {

	public static void main(String[] args) {

		// [정보처리기사 실기문제]
		// 화폐단위 : 5만원, 1만원, 5천원, 1천원, 5백원, 1백원, 5십원, 1십원, 5원, 1원
		int money = 125760;
		int count = 0;
		int share, reminder; // 몫, 나머지 변수
		// 5만원 : 2장      25760
		
		//                             /5       /2       /5      /2     /5    /2   /5 /2  /5
		int [] unit = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		String [] sunit = { "5만원", "1만원", "5천원", "1천원", "5백원", "1백원", "5십원", "1십원", "5원", "1원" };

		for (int i = 0; i < unit.length; i++) {
			count = share = money / unit[i];
			reminder = money % unit[i];
			System.out.printf("%d원 : %d 개\t\t %d\n", unit[i], count, reminder);
			money = reminder;
		}

		// 1만원 : 2장        5760
		// 5천원 : 1장          760
		// 1천원 : 0장          760
		// 5백원 : 1개          260
		// 1백원 : 2개            60
		// 5십원 : 1개            10
		// 1십원 : 1개              0
		// 5원   : 0개              0
		// 1원   : 0개              0






	} // main



} // class
