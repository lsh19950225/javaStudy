package days03;

import java.util.Scanner;

/**
 * @author lsh
 * @date 2024. 7. 3. - 오후 3:06:01
 * @subject
 * @content
 *
 */
public class Ex_04 {

	public static void main(String[] args) {
		
		// tab
		// shift + tab
		// ctrl + a
		// ctrl + i
		// \s -> 스페이스, \\ -> \, * -> 노상관
		String input = "1 fish 2 fish red fish blue fish";
		Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
		System.out.println(s.nextInt());
		System.out.println(s.nextInt());
		System.out.println(s.next());
		System.out.println(s.next());
		s.close();

	} // main

} // class
