package days14;

/**
 * @author lsh
 * 	@date 2024. 7. 18. - 오후 2:08:01
 * @subject
 *	@content
 * 
 */
public class Ex08 {

	public static void main(String[] args) {

		/*
		 * 								[상속 계층도]
		 * 									Object
		 * 			위													위
		 *		Point											Shape 도형클래스
		 *		Ex03.java											위
		 *														circle 원, Triangle 삼각형, 사각형 등등
		 *
		 *		is-a관계
		 *		원은 도형이다.
		 *		삼각형은 도형이다.
		 */

		// Point p = new Point(1,2);


	} // main

} // class

class Shape {
	String color = "black";
	// 도형을 그리는 메서드
	void draw() {
		System.out.printf("color=%s\n", this.color);
	}

	void 면적계산() {

	}
} // Shape

class Circle extends Shape{

	// 원점, 반지름
	//int x;
	//int y;
	Point center; // has-a 관계
	int r; // radius 반지름

	Circle() {
		this(0,0,0);
	}
	Circle(int x, int y, int r) {
		this.center = new Point(x,y);
		this.r = r;
	}
	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}

	// 오버라이딩 : 부모로 부터 받은 함수를 재정의해서 쓴다. : 모든게 똑같아야함. 하나만 가능 : 자식이 접근지정자가 더 크면 가능.
	@Override // 컴파일러에게 알림.
	// 함수 프로토타입 // { } : 메서드 몸체, 바디
	void 면적계산() {
		// 반지름*반지름*3.14
	}

}

class Triangle extends Shape{

	Point [] p = null;
	public Triangle(Point [] p) { // 생성자 DI(의존성 주입)
		this.p = p;
	}

	@Override
	void 면적계산() {
		// 가로*세로*1/2
	}

}
