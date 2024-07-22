package days16;

import java.io.IOError;
import java.io.IOException;

/**
 * @author lsh
 * 	@date 2024. 7. 22. - 오전 10:44:41
 * @subject [예외 고의로 개발자가 발생시키기]
 *	@content		throw 문 사용.
 * 
 */
public class Ex01_06 {

	public static void main(String[] args) {
		
		// 컴파일러가 컴파일할 때
		// ㄴ 예외 체크 o : checked 예외
		// ㄴ 예외 체크 x : unchecked 예외
		
		// extends RuntimeException : 컴파일러가 체크를 안함. - unchecked
		throw new ArithmeticException(); // gpt
		
		// Unhandled exception type IOException : 예외 처리 핸들링을 안함.
		// throw new IOException();
		
		// System.out.println("end");

	} // main

} // class
