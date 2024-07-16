package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String name;
		
		int age = 20;
		
		System.out.print("이름 입력 ? ");
		name = bufferedReader.readLine();
		
		System.out.print("나이 입력 ? ");
		age = Byte.parseByte(bufferedReader.readLine());
		
		System.out.printf("이름=\"%s\", 나이=%d\n", name, age);
		


		

	} // main
	

} // class
