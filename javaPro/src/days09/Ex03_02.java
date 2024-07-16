package days09;
/**
 * @author lsh
 * @date 2024. 7. 11. - 오후 12:40:44
 * @subject 재귀함수
 * @content
 *
 */
public class Ex03_02 {

	public static void main(String[] args) {

		int n = 10;

		//      int result =  hap(n);
		int result =  recursiveHap(n);
		System.out.println( result );







	} // main

	// 10+9+8+..+3+2+1
	private static int recursiveHap(int n) {
		if( n == 1 ) return n;
		else   return n + recursiveHap(n-1);
	}


} // class
