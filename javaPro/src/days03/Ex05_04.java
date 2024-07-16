package days03;

/**
 * @author lsh
 * @date 2024. 7. 3. - 오후 3:54:50
 * @subject 논리연산자
 * @content 참/거짓
 *            1. 일반 논리 연산자
 *            ㄱ. && 				일반논리 AND 연산자(논리곱)
 *            두 피연산자가 모두 참일 때만 참
 *                              
 *            ㄴ. || - enter 위 	일반논리 OR 연산자
 *            참 참 참 거짓 - 둘다 거짓이면 거짓
 *            
 *            ㄷ. ! 					부정(NOT) 연산자
 *            !참 거짓 !거짓 참
 *            
 *            2. 비트 논리 연산자
 *            		ㄱ. &  비트논리 AND 연산자
 *            		ㄴ. |  	비트논리 OR 연산자
 *            		ㄷ. ^ 	XOR 연산자 == e[X]clusive 배타적인
 *            		ㄹ. ~ 	틸드 연산자(비트부정연산자)
 *
 */
public class Ex05_04 {

	public static void main(String[] args) {
		/*// Dead code == 죽은코딩
		System.out.println(3>5 && 100>1);
		
		// The operator ! is undefined for the argument type(s) int
		System.out.println(!3>5);*/
		
		System.out.println(10 & 3);
		System.out.println(10 | 3);
		System.out.println(10 ^ 3);
		
		
		System.out.println(~10);

	}

}
