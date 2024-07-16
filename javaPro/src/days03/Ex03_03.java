package days03;

/**
 * @author lsh
 * @date 2024. 7. 3. - 오후 12:42:42
 * @subject 타입 변환
 * @content 1) 자동 형 변환
 *                  - 큰 자료형 = 작은자료형값
 *                 2) 강제 형 변환
 *
 */
public class Ex03_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no = 15;
		System.out.printf("%d\n", no);
		System.out.printf("%04d\n", no);
		System.out.printf("-".repeat(20));
		
		// 3.14 - double
		// float pi = 3.14; x
		// float pi = (float)3.14;
		// float pi = 3.14F;
		
		
		
		int i = 100; // [][][][] 작은 -> 큰
		long I = i; // [][][][][][][][] 1번째 경우
		
		// 자동 형변환 2번째 경우
		long k = I + i; // 큰자료형 + 작은자료형 -> 큰자료형
		
		
		// 자동 형 변환 x
		// 강제 형 변환 - (변환하고자하는 타입) cast 연산자
		// cast 강제 형 변환
		i = (int) 100L;
		
		// () 최우선 연산자
		// (3 + 5) * 2 == 16
		
		// 3 + 5 * 2 == 13
		//          1
		//    2

	}

}
