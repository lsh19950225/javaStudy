package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// io == in out put == 입출력

/**
 * @author lsh
 * @date 2024. 7. 3. - 오전 10:51:16
 * @subject [S]canner 클래스 == 물건, 객체, 개체
 * @content
 *
 */
public class Exo2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String name;
		
		byte age = 20;
		
		System.out.print("> 이름 입력 ? ");
		name = bufferedReader.readLine();
		
		System.out.print("> 나이 입력 ? ");
		age = Byte.parseByte(bufferedReader.readLine());
		// Type mismatch: cannot convert from String to byte
		// 타입(형) 변환
		// "20" -> 20
		// String -> byte B.parse~
		//               int   I.parse~
		// String strAge = bufferedReader.readLine(); // "20"
		// age = Byte.parseByte(strAge);
		
		// 문제점 : 나이를 입력이 잘못되면
		// ㄴjava.lang.NumberFormatException : 오류 발생
		System.out.printf("이름=\"%s\", 나이=%d", name, age);

	}

}
