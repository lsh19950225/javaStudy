package days16;

/**
 * @author lsh
 * 	@date 2024. 7. 22. - 오후 3:46:34
 * @subject
 *	@content
 * 
 */
public class Ex05_04 {

	public static void main(String[] args) {
		
		/*
		String todo = "   홍길동    ";
		System.out.printf("[%s]\n", todo);
		System.out.printf("[%s]\n", todo.trim()); // 양쪽 공백 x
		System.out.printf("[%s]\n", todo.strip()); // 양쪽 공백 x
		System.out.printf("[%s]\n", todo.stripLeading()); // 앞 공백 x
		System.out.printf("[%s]\n", todo.stripTrailing()); // 뒤 공백 x
		*/
		
		// String.join() ***
		String [] names = {"이시훈", "원충희", "김준석"};
		String content =String.join("</li><li>", names);
		System.out.println("<ol><li>" + content + "</li></ol>");
	}

}
