package days22;

import java.io.Serializable;

public class User implements Serializable { // 직렬화 가능한 클래스.
	
	String name;
	// 객체를 직렬화할 때 password는 포함 x
	transient String password;
	int age;
	
	public User() {
		this("UnKnown", "1234", 0);
	}

	public User(String string, String password, int age) {
		this.name = name;
		this.password = password;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", age=" + age + "]";
	}
	
}
