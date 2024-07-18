package days14;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {

		/*6. [취업 문제] ego(자아)
		  String n = "keNik";   
		  String m= "kKnie";   

		  위의 두 문자열 n, m 이 알파벳과 알파벳갯수가 똑같은지 비교하는 코딩 
		  결과는 같을 경우 true/ 다를 경우 false 로 출력.
		  조건) 대소문자는 구분하지 않는다.*/

		String n = "keNik";
		String m = "kKnie";

		char [] nArr  = n.toUpperCase().toCharArray();
		char [] mArr = m.toUpperCase().toCharArray();

		//System.out.println(n);
		//System.out.println(m);

		Arrays.sort(nArr);
		Arrays.sort(mArr);

		System.out.println( Arrays.toString(nArr));
		System.out.println( Arrays.toString(mArr));

		System.out.println(  Arrays.equals(nArr, mArr)  );

		// char [] -> String
		// String -> char[]
		n = String.valueOf(nArr);
		m = String.valueOf(mArr);

		// System.out.println( n.equals(m) );

	} // main

} // class
