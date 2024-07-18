package days14;

/**
 * @author lsh
 * 	@date 2024. 7. 18. - 오전 11:38:31
 * @subject
 *	@content
 * 
 */
public class Ex05 {

	public static void main(String[] args) {

		// 상속관계(is-a 관계)
		// - 상속(inheritance)
		//		기존의 클래스를 재사용하여 새로운 클래스를 선언하는 것.
		//				(멤버들)
		// - 장점 : 코드 재사용. -> 생산성 향상, 유지보수 용이
		// [접근지정자] [기타제어자] class 클래스명 extends Super 클래스{
		//			멤버(필드, 메서드)								//부모
		// }
		
		//Point3D p1 = new Point3D(1,2,3);
		//System.out.println(p1.x);
		
		new Point3D(1,2,3);

	} // main

} // class

/*class Point3D{
	int x;
	int y;
	int z;

	Point3D(){}
	Point3D(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
}*/

// 기존 클래스
class Point2D {
	
	int x;
	int y;
	
	Point2D(){}
	Point2D(int x, int y){
		this.x = x;
		this.y = y;
		System.out.println("Point2D 객체 생성 - 디폴트생성자 호출됨.");
	}	
}

class Point3D extends Point2D{ // 확장(연장)된
	// x, y
	int z;

	Point3D(){
		System.out.println("Point3D 객체 생성 - 디폴트생성자 호출됨.");
	} // 생성자는 상속되지 않는다.
	Point3D(int x, int y, int z){
		// 부모(super)클래스로 부터 물려받은 필드 초기화
		// this.x = x;
		// this.y = y;
		super(x, y); // 부모의 매개변수를 물려 받아 초기화 하겠다.
		
		this.z = z;
		System.out.println("Point3D 객체 생성 - 디폴트생성자 호출됨.");
	}
}



