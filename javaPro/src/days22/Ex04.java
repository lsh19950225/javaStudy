package days22;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Ex04 {

	public static void main(String[] args) {

		/*
		 * [직렬화/역직렬화]
		 * 1. 부모를 직렬화 할 수 있는 즉 implements Serializable 구현한 클래스라면
		 * 		자식은 Serializable 구현하지 않아도 직렬화 가능. : 모든 자식들 다 가능.
		 */

		Child c = new Child();
		c.name = "홍길동";
		c.age = 20;
		// 직렬화 대상에서 부모의 멤버는 제외된다.

		String name = ".\\src\\days22\\child.ser";
		try (FileOutputStream fos = new FileOutputStream(name);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) { // 보조스트림.
			oos.writeObject(c);
			oos.flush();
			System.out.println("c 객체를 직렬화 시켜서 oos 파일로 저장완료");
		} catch (Exception e) {
			e.printStackTrace();
		}

	} // main

} // class

/*class Parent implements Serializable{
	String name;
}

class Child extends Parent{ // 직렬화 가능.
	int age;
}*/

class Parent{
	String name;
}

class Child extends Parent implements Serializable{ // 직렬화 가능, 부모 멤버는 제외.
	int age;

	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeUTF(name); // 개발자 직접  추가
		out.defaultWriteObject(); // age
	}
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		name = in.readUTF(); // 개발자 직접  추가
		in.defaultReadObject();  // age
	}

}

