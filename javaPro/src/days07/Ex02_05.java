package days07;

/**
 * @author lsh
 * @date 2024. 7. 9. - 오전 11:38:09
 * @subject
 * @content
 *
 */
public class Ex02_05 {

	public static void main(String[] args) {

		//      마름모
		//
		//      __*             (1,3)
		//      _***       (2,2)     (2,4)
		//      ***** (3,1)               (3,5)
		//      _***       (4,2)      (4,4)
		//      __*             (5,3)

		/*for (int i = 1; i <= 5 ; i++) {
         for (int j = 1; j <= 5 ; j++) {
            System.out.print(i+j>=4 && j-i<=2 && i-j<=2 && i+j<=8?"*":"_");

         } // for j
         System.out.println();
      } // for i*/

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i+j>=4 && j-i<=2?"*":"_");
			}
			System.out.println();
		}

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {

				if (i+j>=4 && j-i<=2) {
					System.out.print("*");
				}
				else {
					System.out.print("_");
				}
			}
			System.out.println();
		}

		//      모래시계
		//      *****
		//      _***_
		//      __*__
		//      _***_
		//      *****

		/*for (int i = 1; i <= 5 ; i++) {
			for (int j = 1; j <= 5 ; j++) {
				System.out.print((i-j>=0 && i+j>=6) || (i+j<=6 && i-j<=0)?"*":"_");

			} // for j
			System.out.println();
		} // for i*/



	} // main

} // class
