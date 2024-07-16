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
public class Exo2_02 {

	public static void main(String[] args) throws IOException {
		// ctrl + shift + o
		
		// 이름을 표준입력장치(키보드)로 부터 입력받아서 출력
		// 키보드 -> System.in -> 문자변환 -> 문자열 변환
		String name;
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ));
		
		
		
		// Unhandled exception == 에러 type IOException
		System.out.print("> 이름 입력 ? ");
		name = br.readLine(); // String
		
		System.out.printf("이름=\"%s\"\n", name);

	}

}
