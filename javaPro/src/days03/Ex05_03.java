package days03;

/**
 * @author lsh
 * @date 2024. 7. 3. - 오후 3:44:27
 * @subject 비교연산자
 * @content 크다,작다,같거나크다,
 * 					비교연산의 결과는 boolean 참 거짓
 *
 */
public class Ex05_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10 , j = 3;
				System.out.println(i>j);
				System.out.println(i<j);
				System.out.println(i>=j);
				System.out.println(i<=j);
				// 주의할 점
				System.out.println(i==j);
				// The operator ! is undefined for the argument type(s) int
				// System.out.println(i=!j); 부정대입
				System.out.println(i!=j);

	}

}
