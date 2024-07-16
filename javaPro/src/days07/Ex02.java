package days07;

/**
 * @author lsh
 * @date 2024. 7. 9. - 오전 10:23:31
 * @subject
 * @content
 *
 */
public class Ex02 {

	public static void main(String[] args) {

		/*
	      i=1   j=1
	      i=2   j=1,2
	      i=3   j=1,2,3
	      i=4   j=1,2,3,4
		 *
		 **
		 ***
		 ****
		 */
		/*for (int i = 1; i <= 4 ; i++) {      // 행 갯수
			for (int j = 1; j <= i; j++) {   // 별(열) 갯수
				System.out.print("*");
			}
			System.out.println();
		}*/


		/*
		****
		***
		**
		*

		i=1   j=1,2,3,4
		i=2   j=1,2,3
		i=3   j=1,2
		i=4   j=1

		i+j=5
		j=5-i
		*/
		
		/*
		 * i=4  
		 * i=3
		 * i=2
		 * i=1
		 *
		 */
		/*for (int i = 4; i >= 1 ; i--) {      // 행 갯수
			for (int j = 1; j <= i; j++) {   // 별(열) 갯수
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	      for (int i = 1; i <= 4 ; i++) {      // 행 갯수
	         for (int j = 1; j <= 5-i; j++) {   // 별(열) 갯수
	            System.out.print("*");
	         }
	         System.out.println();
	      }*/











	} // main

} // class
