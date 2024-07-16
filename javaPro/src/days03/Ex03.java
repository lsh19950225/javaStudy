package days03;

/**
 * @author lsh
 * @date 2024. 7. 3. - 오후 12:15:28
 * @subject
 * @content
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		
		int i = 10;
		
		System.out.println(Integer.toBinaryString(i)); // "1010" 2진수
		System.out.println(Integer.toOctalString(i)); // "1010" 8진수
		System.out.println(Integer.toHexString(i)); // "1010" 16진수
		/*
		// 10진수, 8진수, 16진수 값으로 출력.
		System.out.printf("%d \n", i);
		System.out.printf("%#o \n", i);
		System.out.printf("%#x \n", i);
		
		int money = 23535790;
		System.out.printf("%,d\n", money);
		*/

	} // main

} // class
