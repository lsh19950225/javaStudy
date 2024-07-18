package days14;

public class Ex03 {

	public static void main(String[] args) { // 강사님 참고

		// 객체(클래스) 복사와 복제
		// [생성자 복제]

		Point p2 = new Point();

	} // main

} // class

// 모든 클래스의 최상위 클래스는 java.lang.Object 이다.
// 컴파일러가 자동으로 Object 클래스 상속
class Point { // 컴파일러가 extends Object 자동으로 추가

	int x, y;
	Point(){
		this(0,0);
	}

	Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	Point(Point p){
		this.x = p.x;
		this.y = p.y;
	}

	String getXY() {
		return String.format("(%d, %d)", this.x, this.y);
	}

}
