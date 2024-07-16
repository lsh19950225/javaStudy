package days12;

/**
 * @author User1
 *			객체(클래스) 복제 Clone
 *			얉은 복제
 *			깊은 복제
 */
public class Ex06_02 {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		p1.x = 10;
		p1.y = 20;
		p1.m = new int [2];
		p1.m[0]=1; p1.m[1]=2;
		p1.dispPoint(); // x=10, y=20
		
		// 객체 복사
		Point p2 = p1;
		p2.dispPoint(); // x=10, y=20
		
		// 객체 복제
		Point p3 = new Point();
		p3.x = p1.x;
		p3.y = p1.y;
		
		// p3.m = p1.m; 얉은 복제
		
		// 깊은 복제
		p3.m = new int[2];
		p3.m[0] = p1.m[0];
		p3.m[1] = p1.m[1];
		
		p3.dispPoint();

	} // main

} // class
