package days03;

/**
 * @author lsh
 * @date 2024. 7. 3. - 오후 3:32:58
 * @subject 산술연산자 설명.
 * @content + - * /    % - 나머지 연산자
 *
 */
public class Ex05_02 {

	public static void main(String[] args) {
		// 주의할 점
		// 1. 정수 / 0
		// java.lang.ArithmeticException 산술적 예외가 발생 by zero
		// System.out.println(10 / 0);
		
		//2. 실수 / 0 Infinity
		//System.out.println(10.0 / 0);
		//System.out.println(Double.isInfinite(10.0 / 0)); // true
		
		// 실수 % 0 NaN 리터럴
		System.out.println(10.0 % 0);
		System.out.println(Double.isNaN(10.0 % 0)); // true
		/*
		int i = 10, j = 3;
		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / j);
		
		// 나머지 연산자
		System.out.println(i % j);
		System.out.println((double)i / j);
		*/
	}

}
