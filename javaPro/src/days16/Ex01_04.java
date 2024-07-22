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
public class Ex01_04 { // 강사님 참고

	public static void main(String[] args) {

		int a = 0, b = 0;
		Scanner scanner = new Scanner(System.in);

		// 다중 catch 문 -> JDK 1.7 | 기호 (연산자 x) 멀티 catch 문
		try {
			System.out.print("a, b 두 정수 입력 ? ");
			a = scanner.nextInt();
			// java.util.InputMismatchException : 타입이 일치하지 않음. a -> nextInt()
			b = scanner.nextInt();
			double c = a/b;
			System.out.printf("%d/%d=%.2f\n",a,b,c);
		}
		catch (InputMismatchException | ArithmeticException e) { // 멀티 catch 문
			System.out.println(e.toString());
		}
		catch (Exception e) { // 없어도 상관없다.	
			e.printStackTrace(); // gpt
		} finally { // 없어도 된다. 하지만 나중에 예외가 발생하든 안하든 반드시 처리해야 될 구문이 있다면 필요하다.
			System.out.println();
		}

		System.out.println("end");

	} // main

} // class
