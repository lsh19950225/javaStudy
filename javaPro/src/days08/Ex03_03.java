package days08;

import java.util.Arrays;

/**
 * @author lsh
 * @date 2024. 7. 10. - 오전 11:24:13
 * @subject
 * @content
 *
 */
public class Ex03_03 {

	private static final int GHIJKLX = 0;
	private static final int ABCDEF = 0;
	public static void main(String[] args) {

		// [주민등록번호]
		// 6. 검증

		String rrn = "950225-1235610";
		// 이니 아니니 true 값
		if (isCheckRRN(rrn)) {
			System.out.println("올바른 주민등록번호이다.");
		} else {
			System.out.println("잘못된 주민등록번호이다.");
		}





	} // main
	
	// 시험
	private static boolean isCheckRRN(String rrn) {
		// "950225-1235610"
		// 2*A+3*B+4*C+5*D+6*E+7*F+8*G+9*H+2*I+3*J+4*K+5*L
		int [] m = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		int T = 0;
		for (int i = 0; i <= 12; i++) {
			// if (i==6) continue; // '-' 자리 : 0을 넣어서 주석 가능
			T += m[i] * ( rrn.charAt(0)-'0' );
		}
		int X = rrn.charAt(13)-'0';
		return X==(11-T%11)%10;
	}



	// 리턴 타입
	/*private static boolean isCheckRRN(String rrn) {
		// ABCDEF-GHIJKLX                                                          나머지
		int A = rrn.charAt(0)-'0'; // '8' : 56 저장되니까 빼주기
		int B = rrn.charAt(1)-'0'; // '8' : 56 저장되니까 빼주기
		int C = rrn.charAt(2)-'0'; // '8' : 56 저장되니까 빼주기
		int D = rrn.charAt(3)-'0'; // '8' : 56 저장되니까 빼주기
		int E = rrn.charAt(4)-'0'; // '8' : 56 저장되니까 빼주기
		int F = rrn.charAt(5)-'0'; // '8' : 56 저장되니까 빼주기
		//
		int G = rrn.charAt(7)-'0'; // '8' : 56 저장되니까 빼주기
		int H = rrn.charAt(8)-'0'; // '8' : 56 저장되니까 빼주기
		int I = rrn.charAt(9)-'0'; // '8' : 56 저장되니까 빼주기
		int J = rrn.charAt(10)-'0'; // '8' : 56 저장되니까 빼주기
		int K = rrn.charAt(11)-'0'; // '8' : 56 저장되니까 빼주기
		int L = rrn.charAt(12)-'0'; // '8' : 56 저장되니까 빼주기
		//
		int X = rrn.charAt(13)-'0'; // '8' : 56 저장되니까 빼주기
		// int A = Integer.parseInt( rrn.substring(0, 1) ); 위랑 같다.
		return X == (11-(2*A+3*B+4*C+5*D+6*E+7*F+8*G+9*H+2*I+3*J+4*K+5*L)%11)%10;
		// mod 나머지 연산자 : %

	}*/

	// 내가 한거
	/*String check = "950225-1700001";
		String regex = "-";
		String [] CheckRnn = check.split(regex);

		System.out.println( Arrays.toString(CheckRnn) );

		for (int i = 0; i < CheckRnn.length; i++) {

		}*/

} // class
