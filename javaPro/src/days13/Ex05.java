package days13;

/**
 * @author lsh
 * 	@date 2024. 7. 17. - 오후 12:32:58
 * @subject 		[생성자(constructor)]
 *	@content			1. 일종의 메서드이다.
 *							2. 메서드명 == 클래스명 : 반드시
 *							3. 리턴자료형 x : void도 x 아무것도 안씀. 아예 없음.
 *							4. 역할 : 필드 초기화
 *							5. 호출시기 : 인위적으로 호출 x
 *											객체 생성할 때 자동으로 호출.
 *											new Tv(); -- (); : 생성자 호출
 *							6. 오버로딩 가능.
 *							7. 디폴트 생성자(default)
 *								: 매개변수가 없는 생성자.
 *							8. 생성자는 상속되지 않는다.
 *							9. 생성자는 접근지정자 o, 기타제어자 x
 *							10. 컴파일러에 의해서 생성자가 1개도 없는 경우에 자동으로 디폴트 생성자를 생성한다.
 * 
 */
public class Ex05 {

		public Ex05() {
		
		}
		
		public Ex05(String msg) {
			
		}
		
		public static void main(String[] args) {
			
			// 객체(클래스) 배열
			//Point2 p2 = new Point2(15, 20);
			//p2.dispPoint();
			Point2 [] points = {
					new Point2(10,20),
					new Point2(1,2)
			};
			//points[0].dispPoint();
			
			/*Point2 p1 = new Point2(10,20);
			p1.dispPoint(); // 10 20
			
			Point2 p2 = new Point2(10,20);

			p2.dispPoint(); // 1 2
			
			p1.plusPoint(p2); // 매개변수 : p2
			
			p1.dispPoint();
			
			
			p1.plusPoint(p1, p2).dispPoint(); // 사용 불가
			p2.plusPoint(p1, p2).dispPoint();
			
			Point2 p3 = p1.plusPoint(p1, p2); // 재사용 가능
			p3.dispPoint();*/

	} // main

} // class
