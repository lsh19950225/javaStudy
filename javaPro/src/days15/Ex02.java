package days15;

public class Ex02 {

	public static void main(String[] args) {
		
		// [추상메서드]
		// ㄴ 몸체가 없는 메서드
		
		// [추상클래스]
		// ㄴ 공통적인 멤버를 가진 클래스 설계..
		// ㄴ 객체를 생성할 수 없다.
		// ex) new Parent();
		
	} // main

} // class

abstract class Parent {
	//필드
	// 생성자
	// 추상메서드
	abstract void dispA();
	abstract void dispB();
	abstract void dispC();
	// 메서드
	
	Parent p = new Child();
	// p.dispA(); // 강사님 참고
}

class Child extends Parent {

	@Override
	void dispA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void dispB() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void dispC() {
		// TODO Auto-generated method stub
		
	} // 반드시 재정의 해야됨.

	
		
		
	}
	
