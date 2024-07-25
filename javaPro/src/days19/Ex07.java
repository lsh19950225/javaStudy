package days19;

import java.util.HashSet;

/**
 * @author lsh
 * 	@date 2024. 7. 25. - 오후 2:07:23
 * @subject
 *	@content
 * 
 */
public class Ex07 {

	public static void main(String[] args) {
		
		// Set - 순서 x, 중복 x
		//			HashSet 컬렉션 클래스
		//			순서 o + Set = LinkedHashSet 컬렉션 클래스 ***
		HashSet hs = new HashSet(); // 16
		hs.add(9);
		hs.add(11);
		hs.add(15);
		hs.add(10);
		System.out.println(hs); // 순서 유지 x
		
		hs.add(11); // 중복 허용 x
		System.out.println(hs);
		
	} // main

} // class
