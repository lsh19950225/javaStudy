package days06;

/**
 * @author lsh
 * @date 2024. 7. 8. - 오후 5:08:32
 * @subject 
 * @content
 *
 */
public class Ex09 {

	public static void main(String[] args) {

		/*for (int i = 1; i <= 4; i++) {
			// System.out.println("****");
			for (int j = 1; j <= 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		for (int i = 1; i <= 4; i++) {
			if (i - 1 == 0) System.out.print("*");
			else if (i - 1 == 1) System.out.print("**");
			else if (i - 1 == 2) System.out.print("***");
			else System.out.print("****");
			System.out.println();
		}

		for (int i = 1; i <= 4; i++) {
			if (i - 1 == 0) System.out.print("****");
			else if (i - 1 == 1) System.out.print("***");
			else if (i - 1 == 2) System.out.print("**");
			else System.out.print("*");
			System.out.println();
		}
		



	}

}
