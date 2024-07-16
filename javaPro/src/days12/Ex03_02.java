package days12;

public class Ex03_02 {

	public static void main(String[] args) {
		
//		int [] m = null;
//		// The local variable m may not have been initialized : 초기화
//		// *** java.lang.NullPointerException
//		System.out.println(m[0]);
		
		Tv t1 = null;
//		// The local variable m may not have been initialized : 초기화
//		// *** java.lang.NullPointerException
		//System.out.println(t1.channel);
		
		t1 = new Tv(); // 인스턴트 생성 코드
		tvTest(t1);

	} // main

	private static void tvTest(Tv t1) {
		
		System.out.println(t1.channel);
		
	}

} // class
