package days06;

import java.util.Scanner;

/**
 * @author lsh
 * @date 2024. 7. 8. - 오전 11:23:33
 * @subject
 * @content
 *
 */
public class Ex03_04 {

	public static void main(String[] args) {
		
		int kor;
		Scanner scanner = new Scanner(System.in);
		String strKor; // "0"~"100"
		String regex = "\\d{1,2}|100"; // | 100 : 100 도 포함.
		// [0-9][0-9][0-9]
		// \\d\\d\\d
		// \\d{3}
		
		// \\d*
		// {n,m}
		
		
		// System.out.println( strKor.matches(regex) );
		
		int failCount = 0;
		do {
			if (failCount != 0) {
				System.out.printf("[%d]번 실패!!\n", failCount);
			}
			if (failCount == 3) {
				System.out.println("오늘 그만");
				return;
			}
			System.out.printf("국어 점수 ? ");
			strKor = scanner.next();
			failCount++;
		} while (!strKor.matches(regex));
		
		kor = Integer.parseInt(strKor);
		
		System.out.println(kor);
		
		
		
		
		
		

	} // main

} // class
