package days20;

/**
 * @author lsh
 * 	@date 2024. 7. 26. - 오후 3:15:53
 * @subject
 *	@content
 * 
 */
public class Ex08_03 {

	public static void main(String[] args) {
		
		// [제네릭의 제한]

	} // main

} // class

class Box2<T> {
	
	// Cannot make a static reference to the non-static type T
	// 1) 제한 - 제네릭클래스에는 클래스변수를 선언 x
	// static T item2;
	
	// Cannot make a static reference to the non-static type T
	// 2) 제한 - 클래스 메서드 T 타입 사용 x
//	static int compare(T a, T b) {
//		return 0;
//	}
	
}
