package days08;

/**
 * @author lsh
 * @date 2024. 7. 10. - 오후 4:13:22
 * @subject
 * @content
 *
 */
public class Ex04_02 {

	public static void main(String[] args) {

		// [정보처리기사 실기문제]
		// 화폐단위 : 5만원, 1만원, 5천원, 1천원, 5백원, 1백원, 5십원, 1십원, 5원, 1원
		int money = 125760;
		int count = 0;

		int unit = 50000;
		boolean sw = false; // 스위치 변수

		while (unit >= 1) {
			count = money / unit;
			money = money % unit;
			System.out.printf("%d원 : %d개 \t %d\n", unit, count, money);
			unit /= sw ? 2 : 5;
			sw = !sw; 
		} // while




	} // main



} // class
