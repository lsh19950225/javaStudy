package days14;



// 사원 클래스
// 모든 사원들이 공통적으로 가지고 있을 멤버들을 선언.
// @Getter
public abstract class Employee {
		// 클래스도 불완전해 추상클래스 사용해야 됨.
	//필드
	private String name; // 사원명
	private String addr; // 주소
	private String tel; // 연락처
	private String hiredate; // 입사일자
	
	// 생성자
	public Employee() {
		super();
		System.out.println("Employee 디폴트 생성자 호출됨.");
	}

	public Employee(String name, String addr, String tel, String hiredate) {
		super();
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.hiredate = hiredate;
		System.out.println("Employee 4 생성자 호출됨.");
	}
	
	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	
	// 메서드
	// 사원들의 정보를 출력하는 메서드
	public void dispEmpinfo() {
		System.out.printf("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s\n", this.name, this.addr, this.tel, this.hiredate);
	}
	
	/*
	// 다른언어 가상메서드 자바에서는 x
	public int getPay() {
		return 0;
	}
	*/
	
	// 추상메서드 : 몸체가 구성이 안된 불완전한 메서드
	// This method requires a body instead of a semicolon : 몸체가 없다.
	public abstract int getPay();

} // class
