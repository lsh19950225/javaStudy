package days10;

public class Ex03 {

	public static void main(String[] args) { // 강사님 참고
		/*
		double result = pow(2,3);
		System.out.println(result);

		result = pow(2,-3);
		System.out.println(result);
		*/
		
		double result = recursivePow(2,3);
		System.out.println(result);

		result = pow(2,-3);
		System.out.println(result);




	} // main
	
	private static double recursivePow(int i, int j) {
		//if (j > 1) return i * recursivePow
		
		return 0;
	} // recur

	private static double pow(int i, int j) {
		
		double  result = 1;
		int exp = Math.abs(j); // 절대치 구하는 메서드

		for (int k = 0; k < exp; k++) {
			result *= i;

		}

		return j > 0 ? result : 1/result;
	}
} // class
