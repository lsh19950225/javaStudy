package days04;

/**
 * @author lsh
 * @date 2024. 7. 4. - 오전 10:41:29
 * @subject
 * @content
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		// 대 -> 소 변환
		// 소 -> 대 변환
		
		
		char lowerCase = 'x', upperCase;
		// Type mismatch: cannot convert from int to char
		upperCase = (char)(lowerCase - 32);
				System.out.println(upperCase);

	}

}
