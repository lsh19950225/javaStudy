package days14;

import java.io.IOException;

public class Ex09 {

	public static void main(String[] args) {

		/*
		 * 1. 오버로딩(Overloading)
		 * 		- 중복함수
		 * 2. 오버라이딩(Overriding)
		 * 		- 재정의함수
		 *		- override == overwrite == 위에 덮어쓰다.
		 *		- Super클래스로 부터 상속받은 메서드를 재정의한 것.
		 *		- [오버라이딩 조건]
		 *			1) 메서드명 수정할 수 없음.
		 *			2) 매개변수 부모랑 동일, 추가, 삭제 x
		 *			3) 리턴타입 동일
		 *			4) 접근지정자는 부모의 접근지정자보다 같거나 넓어야 된다.
		 *
		 *			5) 부모의 메서드 보다 많은 수의 예외를 선언할 수 없다.
		 */

	} // main

} // class

class Parent {
	int print(String n, int a) throws IOException {
		return 100;
	}
}

class Child extends Parent {
	@Override
	int print(String n, int a) throws IOException {
		return 100 + a;
	}
}