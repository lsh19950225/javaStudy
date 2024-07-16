package days05;

/**
 * @author lsh
 * @date 2024. 7. 5. - 오후 4:51:37
 * @subject
 * @content
 *
 */
public class Ex_09 {

	public static void main(String[] args) {

		// char []
		// for 문
		// String.charAt()
		String todo = "Auto-generated method stub";
		System.out.println(todo.length());
		//								문자열의 길이 length() 메서드
		int size = todo.length();
		char [] todoCharArr = new char[size];
		
		
		//todoCharArr[25] = todo.charAt(25);
		
		for (int i = 0; i < todoCharArr.length; i++) {
			todoCharArr[i] = todo.charAt(i);
		}


	} // main

} // class
