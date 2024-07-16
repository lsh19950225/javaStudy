package days12;

/**
 * @author User1
 *			객체(클래스) 배열
 *
 *			Point p1 = new Point();
 */
public class Ex08 {

	public static void main(String[] args) {
		//          배열명 : 객체명 아니다.

		Point [] points = new Point[5000];

		// [클래스 배열 사용할 때 주의할 점]
		points[0] = new Point();
		
		points[0].x = 10;
		points[0].y = 20;
		points[0].dispPoint();


	} // main

} // class
