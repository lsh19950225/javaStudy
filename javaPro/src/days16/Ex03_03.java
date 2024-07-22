package days16;

/**
 * @author lsh
 * 	@date 2024. 7. 22. - 오후 2:01:44
 * @subject
 *	@content
 * 
 */
public class Ex03_03 {

	public static void main(String[] args) {
		
		Person p1 = new Person("123456-1234567", "홍길동");
		Person p2 = new Person("123456-1234567", "홍길남");
		
		// System.out.println(p1 == p2); // false
		
		// 문자열 == 문자열 비교
		// Object.equals() 재정의 x
		
		// 주민등록번호만 같으면 일단 같은 사람이다.(처리)
		
		System.out.println(p1.equals(p2)); // 재정의 x : == 연산자 동일
		
		// System.out.println("123456-1234567".hashCode());
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		
	} // main

} // class
