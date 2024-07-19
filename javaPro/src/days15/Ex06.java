package days15;

public class Ex06 {

	public static void main(String[] args) { // 강사님 참고
		
		/*
		 * [final 키워드 정리]
		 * 
		 * 
		 */
		
		// final + 변수 앞에 : 상수
		final double PI = 3.141592;
		// PI = 3.141592;
		
		FinalTest ft = new FinalTest();
		ft.test(10);
		
	} // main

} // class

// 1. final + class 선언 : 최종(마지막) 클래스
final class FinalTest {
	// 				매개변수
	void test(final int n) {
		// n = 100; : 수정 불가.
	}
	
}

class P {
	
	// 필드
	final int MAX_VALUE = 1; // 명시적 초기화
	final int MIN_VALUE;
	
	P(int minValue) { // 생성자 초기화
		MIN_VALUE = minValue;
	}
	
	final int disp () { // 재정의 할 수 없는 메서드, 더 이상 오버라이딩을 할 수 없다.
		final int age = 100; // 지역변수
		//
		return 0;
	}
/*
// final 메서드는 자식클래스에서 재정의할 수 없다.
class C extends P {
	@Override
	int disp () {
		//
		return 100;
	}
	*/
}