package days16;

/**
 * @author lsh
 * 	@date 2024. 7. 22. - 오후 4:20:55
 * @subject *** String 클래스 : 불변.
 *	@content
 * 
 */
public class Ex07_02 {
	
	public static void main(String[] args) {
		
		// test_String(); // > String 처리 시간 : 4초 8238ms 75000ns
		test_StringBuilder();
		
	} // main

	private static void test_StringBuilder() {
		long start = System.nanoTime();
		StringBuilder s = new StringBuilder("a");
		for (int i = 0; i < 200000; i++) {
			s.append("a");
		}
		long end = System.nanoTime();
		System.out.printf("String 처리 시간 : %dns\n", (end-start));
		
	}

	private static void test_String() {
		long start = System.nanoTime();
		String s = "a";
		for (int i = 0; i < 200000; i++) {
			s += "a";
		}
		long end = System.nanoTime();
		System.out.printf("String 처리 시간 : %dns\n", (end-start));
	}

} // class
