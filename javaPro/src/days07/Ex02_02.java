package days07;

public class Ex02_02 {

	public static void main(String[] args) {

		//              공    별
		//      ___*   i=1      3     1
		//      __**   i=2      2     2
		//      _***   i=3      1     3
		//      ****   i=4      0     4
		//            i+j=4
		//            j=4-i   j=i

		for (int i = 1; i <= 4; i++) {  // 행 갯수
			// _ 공백 찍는 for
			for (int j = 1; j <= 4-i; j++) {
				System.out.print("_");
			}
			// 별 찍는 for
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		// 강사님 참고
		/*for (int i = 1; i <= 4; i++) {  // 행 갯수
			// _ 공백 찍는 for
			for (int j = 1; j <= 4-i; j++) {
				System.out.print("_");
			}
			// 별 찍는 for
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/



	} // main

} // class
