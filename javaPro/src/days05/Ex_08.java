package days05;

public class Ex_08 {

	public static void main(String[] args) {

		// [ASCII 모두 출력] + for문 사용
		// 9 : '\t' : tab
		// 10 : '\n' : LineFeed(LF)
		// 13 : '\r' : CarrageReturn(CR)

		/*for (int i = 0; i < 256; i++) {
			System.out.printf("%d[%c]\n", i, i);
		}*/

		
		
		
		
		
		for (int i = 0, lineNumber = 1; i < 256; i++) {
			// if (i%10==0) System.out.printf("%d : ",i/10+1);
			if (i%10==0) System.out.printf("%d : ",lineNumber++);
			System.out.printf("[%c]", i);
			if (i%10 == 9) System.out.println();
		}





	} // main

} // class
