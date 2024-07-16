package days04;

/**
 * @author lsh
 * @date 2024. 7. 4. - 오후 12:30:54
 * @subject
 * @content
 *
 */
public class Ex_06 {

	public static void main(String[] args) {
		// 1) x는 10보다 크다.  
		// x>10
		// 2) x는 10보다 크고, 20보다 작다.  
		// x>10 && x<20
		// 3) x는 2의 배수이다.   
		// 𝑚이 n으로 나누어 떨어지는지 확인하면 된다.
		// x % 2 == 0

		// 4) x는 2의 배수 또는 3의 배수이다.
		int x = 4;
		// x%2==0 || x%3==0

		// 5) x는 2의 배수이지만 6의 배수는 아니다.
        // x%2==0 && x%6 != 0
		// 6) 한 문자(ch)가  숫자이다.  
		// 
		// 7) 한 문자가 소문자이다. 
		// 
		// 8) 한 문자가 알파벳이다 ( 대문자이거나 또는 소문자  ) 
		
		
		
		char ch = 'x';
		// The left-hand side of an assignment must be a variable
		// The operator <= is undefined for the argument type(s) boolean, int
	    // System.out.println( 65 <= (int)ch <= 122 ); x

	}

}
