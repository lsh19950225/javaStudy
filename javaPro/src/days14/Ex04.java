package days14;

public class Ex04 {

	public static void main(String[] args) {
		
		/*
		 * [클래스들 간의 관계]
		 * 1. has-a 관계(포함관계)
		 * 		~은 ~을 가지다.
		 * 		A 클래스가 B라는 클래스를 포함하는 관계
		 * 		예) 차 - 엔진 클래스
		 * 2. is-a 관계(상속관계)
		 * 		~은 ~이다.
		 */
		
		Engine engine = new Engine();
		
		// 의존성 주입(DI)
		// 1) 생성자 주입
		// 2) setter 주입
		Car myCar = new Car();
		//Car myCar = new Car(engine); // 1) 생성자 주입
		// myCar.setEngine(engine); // 2) setter 주입
		
		myCar.speedUp(10);
		int currentSpeed = myCar.getEngine().speed;
		
		
		
		System.out.println("현재 속도 : " + currentSpeed);

	} // main

} // class
