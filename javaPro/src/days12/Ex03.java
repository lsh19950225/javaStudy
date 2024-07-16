package days12;

/**
 * @author lsh
 * @date 2024. 7. 16. - 오후 12:17:50
 * @subject
 * @content
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		// 지역변수
		// public int age = 10;
		int [] m = null;
		m = new int[3];
		m[0] = 10;
		// 클래스 == 객체 설계도 // 시험
		// 객체 == 클래스를 자료형으로 하는 참조변수
		Tv t1; // 객체
		t1 = new Tv(); // 인스턴스화 == 객체 생성
		// 멤버들을 접근하는 방법 : 객체명.필드명, 객체명.메서드명()
		// Tv. 클래스명. : 안됨.
		t1.power();
		System.out.println(t1.power ? "O" : "X");
		
		t1.channel = 10;
		System.out.println(t1.channel);
		t1.channelDown(); // 9
		System.out.println(t1.channel);
		
		t1.power();
		System.out.println(t1.power ? "O" : "X");
		
	} // main

} // class
