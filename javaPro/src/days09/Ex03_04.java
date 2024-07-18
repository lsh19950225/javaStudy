package days09;

/**
 * @author lsh
 * @date 2024. 7. 11. - 오후 2:13:35
 * @subject
 * @content
 *
 */
public class Ex03_04 {

	public static void main(String[] args) {
		
		// [문제]
		// 거듭제곱 == 누승 == 멱 == pow
		// 2^3 == 밑수(2)를 지수(3)만큼 반복해서 곱하는 것
		// 2^3 == 2*2*2
		
		//int result = pow(2, 3);
		double result = pow(2, -3);
		System.out.println(result);
		
		
		
		
		

	} // main

	private static double pow(int i, int j) {
		// 2*2*2
		// i = 밑수 , j = 지수
		/*int result = 1;
		for (int k = 0; k < j; k++) {
			result *= i;
		}
		
		return result;*/
		
		double  result = 1;
		int exp = j < 0 ? -j : j;
		
		for (int k = 0; k < exp; k++) {
			result *= i;
			
		}
		
		return j > 0 ? result : 1/result;
		
	}
	
	// 재귀함수
	private static int recursivepow(int i, int j) {
		
		
		return 0;
	}

} // class