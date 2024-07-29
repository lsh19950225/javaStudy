package days21;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		/*// !@#$%^&*(\'"<>?:;

		String t = "!@#$%^&*(\\'\"<>?:;";

		for (int i = 0; i < t.length(); i++) {

			char tArr = t.charAt(i);
			System.out.printf("%c", tArr);

		}*/

		/*apple pen
		출력 #1

		applepen
		입력 #2

		Hello World!
		출력 #2

		HelloWorld!*/

		Scanner sc = new Scanner(System.in);
		
		System.out.println(".");
		
		String aa = sc.next();
		
		String [] aaArr = aa.split(" ");
		
		String a1 = aaArr[0];
        String a2 = aaArr[1];
        
        String result = a1 + a2;
        
        System.out.println(result);
		
		
		
		
		







	}

}
