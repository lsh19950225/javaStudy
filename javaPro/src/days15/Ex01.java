package days15;

import days14.Employee;

/**
 * @author lsh
 * 	@date 2024. 7. 19. - 오전 9:51:16
 * @subject
 *	@content
 * 
 */
public class Ex01 {

	public static void main(String[] args) {
		/*
		// 부모의 부모도 가능.
		Employee emp3 = new SalesMan("김준석", "경기도 남양주", "010-4123-1234", "2024.12.12", 500000, 20, 70000 );
		
		// ***** 
		// 업캐스팅 되어 오버라이딩 함수 실행하면 서브클래스에 가서 최종 오버라이딩 된 함수로 실행됨.
		emp3.dispEmpinfo();
		*/
		
		Employee emp4 = new Temp("김재민", "서울 목동", "010-1234-1234", "2024.12.12", 20, 250000);
		
		emp4.dispEmpinfo();
		
	} // main

} // class
