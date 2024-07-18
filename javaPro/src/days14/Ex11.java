package days14;

/**
 * @author lsh
 * 	@date 2024. 7. 18. - 오후 3:30:26
 * @subject
 *	@content
 * 
 */
public class Ex11 {

	public static void main(String[] args) {

		/*
		 * [4개 클래스]
		 * 		Object
		 * 		위		 위
		 * Temp	 Employee 사원 클래스 (공통적으로 가지고 있는 멤버)
		 *				 위
		 *			 Regular 	정규직 사원 클래스
		 *				 위
		 *			 SalesMan	영업직 사원 클래스
		 *
		 *		개념설명
		 *		1. 상속
		 *		2. 오버로딩/오버라이딩
		 *		3. this/super 키워드 설명
		 *		4. 추상메서드, 추상 클래스 설명
		 *		5. 인터페이스 설명
		 *		6. 다형성 설명
		 *		7. 업캐스팅/다운캐스팅(클래스들 간의 형변환) 등등
		 *
		 *		Lombok 설치
		 */	

		// 1. 사원 객체 생성해서 출력
		/*
		Employee emp1 = new Employee("송세호", "서울 강남구", "010-1234-1234", "2022.12.12");
		emp1.dispEmpinfo();
		*/
		
		// 2.
		
		/*Regular emp2 = new Regular("전재윤", "서울 양천구", "010-1264-1254", "2021.03.21", 4000000);
		emp2.dispEmpinfo(); // 기본급 출력 x
		System.out.println( emp2.getPay() );*/
		
		//2-2. 다형성 이해
		
		// 부모타입						자식객체
		// 정규직은(R) 사원(E)이다.
		// [클래스 간의 형변환]
		// 업캐스팅(upcasting) 자동 형변환
		Employee emp2 = new Regular("전재윤", "서울 양천구", "010-1264-1254", "2021.03.21", 4000000);
		emp2.dispEmpinfo();
		//System.out.println( emp2.getPay() );
		
		// 다운캐스팅(downcasting) : 부모객체를 자식객체로 형변환
		// cast 연산자를 사용해서 강제 형변환
		Regular emp3 = (Regular) emp2;
		
		
		// 상속관계가 없는 클래스들 간의 형변환 x
		// Point p = new Regular();
		
	} // main

} // class







