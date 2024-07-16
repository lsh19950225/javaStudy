package days04;

/**
 * @author lsh
 * @date 2024. 7. 4. - 오전 11:03:20
 * @subject 인덱스 연산자
 * @content []
 *
 */
public class Ex05 {

	public static void main(String[] args) {
		// 한 학생의 국어 점수를 저장할 변수를 선언
		// int kor;
		
		// 5천명 학생의 국어 점수를 저장할 변수를 선언
		
		// [배열]
		// 1. 정의 ? 동일한 자료형을 메모리상에 연속적으로 놓이게 한 것
		// 2. 배열의 선언 형식
		//		타입[] 배열명 = new 타입[배열크기];
		//		타입 변수명[] = new 타입[배열크기];
		// 3. 참조타입
		// int [] kors = new int[3];
		// int [] kors = new int[3];
		
		
		
		//동적
		// [4b][4b][4b]
		// 시작주소값
		// 0x100
		
		int [] kors;
		kors = new int[3];
		
		kors[0] = 100;
		kors[1] = 90 ;
		kors[2] = 20 ;
		System.out.println( kors[0] );
		System.out.println( kors[1] );
		System.out.println( kors[2] );
		System.out.println( kors.length );
		
		
		
		// 배열크기?
		// System.out.println(kors.length);
		
		//주의할 점
		// 오류
		// kors[3] = 99;
			
		}
		
		
		
	}
