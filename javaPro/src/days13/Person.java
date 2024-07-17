package days13;

public class Person {

	private String name = "익명";
	private int age = 20;
	private boolean gender = false;
	
	// 생성자 : 오버로딩
	public Person() {}
	public Person(String n, int a, boolean g) {
		name = n;
		age = a;
		gender = g;
	}
	
	public Person(String n) {
		name = n;
	}
	
	public Person(String n, int a) {
		name = n;
		age = a;
	}
	public void dispPerson() {
		System.out.printf("이름 : %s, 나이 : %d\n", name, age);
	}
	
	// getter, setter : 메서드
	//					규칙
	public void setAge(int _age) { // 쓰기 전용
		if (0 <= _age && _age <= 150) {
			age = _age;	
		} else {
			throw new NullPointerException(); // 에러 코딩
		}
	}
	
	public int getAge() { // 읽기 전용
		return age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
	
} // Person
