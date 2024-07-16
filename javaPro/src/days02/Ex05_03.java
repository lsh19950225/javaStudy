package days02;

/**
 * @author lsh
 * @date 2024. 7. 2. - 오후 3:47:05
 * @subject 숫자(정수계열)
 * @content b1, s2, i4, l8
 *
 */
public class Ex05_03 {

	public static void main(String[] args) {
		
		/* 
		 * [진법]
		 * 1. 10진법 - 0 ~ 9
		 * 2. 2진법 - 0 1
		 * 3. 8진법 - 0 ~ 7
		 * 4. 16진법 - 0 ~ 9, a(10) b(11) c(12) d(13) ~ f(15)
		 * 
		 * 1bit - [0] [1] 2가지 표현
		 * 1byte == 8bit [부호비트] [][][][][][][] - 2^7==128가지  ^:승
		 * -128 0 127
		 * 
		 * short 2 
		 * 2byte == 16bit [부호비트] [][][][][][][]  [][][][][][][][] - 2^15==32768가지
		 * =위
		 * 
		 * int 4
		 * 32b 21억 -21억 ~ 21억
		 * 
		 * long 8
		 * 64b 900경 -900경 ~ 900경
		 */
		
		// 사람의 나이를 저장할 변수 선언.
		byte age = 10;
		// [][][][][1][0][1][0]
		// 국어점수를 저장할 변수 선언.
		byte kor;
		
		// 10 int 1010 맨뒤
		
		// 접미사 d/D l/L
		// 10.0 == 10. == 10d == 10D
		
		int i = 10;
		// long I = 10L;
		long I = 10; // 자동 타입 변환 int -> long 형변환

		// Type mismatch: cannot convert from double to float
		float f = 3.14F; // 3.14f
		double d = 3.14;
		
		
		System.out.printf("%d %d %f %f\n", 100, 100L, 3.14F, 3.14D);

	} 

}
