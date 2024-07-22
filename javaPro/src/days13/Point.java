package days13;

public class Point {

	public int x;
	public int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
	}
	
	// 100
	public Point plusPoint(int temp) { // this 3. 용도
		Point p = new Point(this.x + temp, this.y + temp);
		thisTest(this); // 매개변수로 사용되는 this 3번째 용도
		return this; // 리턴값으로 사용되는 this의 3번째 용도 // this p1
	}

	private void thisTest(Point p) { // p1
		p.dispPoint(); // p1 값 출력
	}

	public void dispPoint() {
		System.out.printf("x=%d, y=%d\n", this.x, this.y);
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	// Duplicate method plusPoint(Point) in type Point : 중복함수로 인식x 자료형
	public void plusPoint(Point p) {

		x = x + p.x;
		y = y + p.y;
		//p1  //p2
	}

	// p1.plusPoint(p1, p2)
	// 리턴자료형 참조형
	public Point plusPoint(Point p1, Point p2) {

		int x = p1.x + p2.x;
		int y = p1.y + p2.y;
		//p1  //p2
		Point p = new Point();
		p.x = x;
		p.y = y;
		return p;
	}

}
