package days09;

/**
 * @author lsh
 * @date 2024. 7. 11. - 오전 10:23:27
 * @subject  년도 입력 받아서 윤년/평년 체크
 * @content
 *
 */
public class Ex02 {

	public static void main(String[] args) {

		// 4로 나누어 떨어지는 해는 윤년, 그 밖의 해는 평년으로 한다.
		// year % 4 == 0
		// 100으로 나누어 떨어지되 400으로 나누어 떨어지지 않는 해는 평년으로 한다. (즉, 끝 두 자리가 00이면서 윗 자리가 4의 배수가 되는 해)
		// year % 100 == 0 && year % 400 != 0 : 평년
		// year % 4 == 0 && year % 100 != 0 || year % 400 == 0 : 윤년
		int count = 0;
		for (int i = 1; i < 2020; i++) {
			if ( isLeapYear(i) ) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("1~2020 윤년 : " + count);
		
	} // main

	public static boolean isLeapYear(int year) {
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			return true;
		return false;
	}

} // class
