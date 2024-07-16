package days06;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author lsh
 * @date 2024. 7. 8. - 오전 10:23:58
 * @subject
 * @content
 *
 */
public class Ex02 {

	public static void main(String[] args) throws IOException {

		/*int skip;
		Scanner scanner = new Scanner(System.in);
		System.out.print("10개 다음 ? ");
		skip = scanner.nextInt();


		for (int i = 0, lineNumber = 1; i < 256; i++) {
			if (i%10 == 0) System.out.printf("%d : ",lineNumber++);
			System.out.printf("[%c]", i);

			if (i%10 == 9) System.out.println();

		} // for*/


		for (int i = 0, lineNumber = 1; i < 256; i++) {
			if (i%10 == 0) System.out.printf("%d : ",lineNumber++);
			System.out.printf("[%c]", i);
			if (i%10 == 9) {
				System.out.println();

				if ( (lineNumber-1) % 10 == 0) {
					System.out.print("엔터치면 계속합니다.");
					System.in.read(); // 13,10
					System.in.skip(System.in.available());
				}

			}

		} // for





	} // main

} // class
