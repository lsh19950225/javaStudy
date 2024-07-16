package days02;

/**
 * @author lsh
 * @date 2024. 7. 2. - 오후 12:36:31
 * @subject 자바 표준 출력 함수
 * @content println(), print(), printf()
 *
 */
public class Ex03_02 {

	public static void main(String[] args) {
		// 이름 변수 선언
		// 키를 저장할 변수 선언
		String name;
		double height;

		name = "이시훈";
		height = 160.24;

		// [출력형식]
		// 이름은 "이시훈"이고, 키는 160.24cm 이다.
		/*
	    System.out.print("이름은 ");
	    System.out.print(name);
	    System.out.print("이고, 키는 ");
	    System.out.print(height);
	    System.out.print("cm 이다.");
		 */
		// 오른쪽
		// 3 + 5 + 7
		// + 문자열 연결 연산자

		//	    System.out.println("이름은 " + name + "이고, 키는 " + height + "cm 이다.");


		// 출력형식이 있는 경우 출력하는 메서드 : printf()   + format(형식)
		// 이름은 "이시훈"이고, 키는 160.24cm 이다.
		// printf() 3가지 파악
		// 1.기능 2.매개변수 3.리턴값  PrintStream
		// System.out.printf(String format, Object... args )
		// String name - printf(%s) conversion
		// double name - printf(%f) - .2 소수점
		System.out.printf("이름은 \"%s\"이고, 키는 %.2fcm 이다.", name, height);



	}

}
