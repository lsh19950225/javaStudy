package days02;

public class Ex20 {

	public static void main(String[] args) {

		/*for (int i = 0; i < 256; i++) {
			System.out.printf("%d[%c]\n", i, i);
		}*/

		/*for (int i = 0, lineNumber = 1; i < 256; i++) {
			if (i%10 == 0) System.out.printf("%d : ",lineNumber++);
			System.out.printf("[%c]", i);
			if (i%10 == 9) System.out.println();*/

		/*String todo = "Auto-generated method stub";
		System.out.println(todo.length());

		int size = todo.length();
		char [] todoCharArr = new char [size];

		for (int i = 0; i < todoCharArr.length; i++) {
			todoCharArr[i] = todo.charAt(i);

			String target = "";
			for (int i1 = 0; i1 < todoCharArr.length; i1++) {
				target += todoCharArr[i1]  ;
			}
			System.out.println(target);


		}*/
		
		/*String todo = "Auto-generated method stub";
		char [] todoCharArr = todo.toCharArray();
		
		String target = String.valueOf(todoCharArr);
		System.out.println(target);*/
		
		String todo = "Auto-generated method stub";

		// String -> char [] 변환
		char [] todoCharArr = todo.toCharArray();
		// char[] -> String 변환
		//String target = new String(todoCharArr);
		String target = String.valueOf(todoCharArr);

		System.out.println(target);
		







	}

}
