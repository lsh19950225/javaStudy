package days16;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author lsh
 * 	@date 2024. 7. 22. - 오전 9:33:56
 * @subject
 *	@content
 * 
 */
public class Ex01_03 { // 강사님 참고

	public static void main(String[] args) {

		int a = 0, b = 0;
		Scanner scanner = new Scanner(System.in);

		// 다중 catch 문
		try {
			System.out.print("a, b 두 정수 입력 ? ");
			a = scanner.nextInt();
			// java.util.InputMismatchException : 타입이 일치하지 않음. a -> nextInt()
			b = scanner.nextInt();
			double c = a/b;
			System.out.printf("%d/%d=%.2f\n",a,b,c);
		}

		catch (InputMismatchException e) {
			System.out.println(e.toString());
		}
		catch (ArithmeticException e) {
			System.out.println(e.toString());
		}
		catch (Exception e) { // 없어도 상관없다.	
			e.printStackTrace(); // gpt
		}

		// 주의할점 : 자식 catch 블럭을 먼저 코딩한다.

		// System.out.printf("a=%d, b=%d", a, b);

		System.out.println("end");

		// 정수를 0으로 나누면 java.lang.ArithmeticException

	} // main

} // class
