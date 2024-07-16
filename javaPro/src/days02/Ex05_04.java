package days02;

/**
 * @author lsh
 * @date 2024. 7. 2. - 오후 4:32:17
 * @subject 진법변환 설명
 * @content 자바 문자 타입
 *                char 유니코드 2byte
 *
 */
public class Ex05_04 {

	public static void main(String[] args) {
		char ch = 'A';
		// 문자코드표
		//소문자
		System.out.printf("\'%c\' - %d\n", ch , (int)ch);
		System.out.printf("\'%c\' - %d\n", 'Z', (int)'Z');
		//한글
		System.out.printf("\'%c\' - %d\n", '가', (int)'가');
		System.out.printf("\'%c\' - %d\n", '힣', (int)'힣');
		// String %s
		// float, double f
		// byte, short, int, long d o x X
		// char c C
		
		char c = 'A';
		char c2 = 65;
		char c3 = 0x0041;
		char c4 = '\u0041'; // 유니코드 2byte 문자
		
		
		// 10 == a
		
		// [진법 변환]
	    // 63
		// 128 64 32 16  8 4 2 1
		// 0011  1111
		// 0x3f
	}

}
