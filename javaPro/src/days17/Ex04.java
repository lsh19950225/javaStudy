package days17;

/**
 * @author lsh
 * 	@date 2024. 7. 23. - 오후 12:21:35
 * @subject
 *	@content
 * 
 */
public class Ex04 {

	public static void main(String[] args) {
		
		// 박싱(boxing), 언박싱(unboxing)
		int i = 100; // 기본형 int
		
		// 기본형 -> 자동으로 래퍼클래스 형변환
		//			오토(auto) 박싱
		Integer j = i; // 래퍼클래스 Integer
		System.out.println(j);
		
		// 래퍼클래스 -> 자동으로 기본형 형변환
		// 				오토 언박싱
		int k = j;
		
		test(1); // int -> Integer -> Object
		test(true);
		test(3.14);
		test('a', "aaa", 19, 1.12, true); // 또는 new Person()
	} // main
	
	public static void test(Object... o) {
		
	}

} // class
