package days15;

import days14.Employee;

// 임시직 사원 클래스
public class Temp extends Employee {

	private int days; // 근무일수
	private int payOfDay; // 하루 일당
	
	public Temp() {
		super();
		System.out.println("Temp 디폴트 생성자 호출됨.");
	}
	
	public Temp (String name, String addr, String tel, String hiredate, int days, int payOfDay) {
		super(name, addr, tel, hiredate);
		this.days = days;
		this.payOfDay = payOfDay;
		System.out.println("Temp 6 생성자 호출됨.");
	}
	
	// 새로 함수 만든 것.
	public int getPay() {
		return this.days * this.payOfDay;
	}
	
	@Override
	public void dispEmpinfo() {
		System.out.printf("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s, 근무일수 %d, 하루 일당 %d\n"
				, this.getName(), this.getAddr(), this.getTel(), this.getHiredate(), this.days, this.payOfDay);
	}
	
} // class
