package days06;

/**
 * @author lsh
 * @date 2024. 7. 8. - 오후 3:11:19
 * @subject  [이름(Label)이 붙은 반복문]
 * @content  break 라벨명;
 *              	continue 라벨명;
 */
public class Ex06 {

	public static void main(String[] args) {

		// 구구단 2단~9단

		/*
	      int dan = 2;
	      for (int i = 1; i <= 9 ; i++) {
	         System.out.printf("%d*%d=%d\n", dan, i, dan * i);
	      }
	      dan = 3;
	      for (int i = 1; i <= 9 ; i++) {
	         System.out.printf("%d*%d=%d\n", dan, i, dan * i);
	      }
	      dan = 4;
	      for (int i = 1; i <= 9 ; i++) {
	         System.out.printf("%d*%d=%d\n", dan, i, dan * i);
	      }
	      :
	      dan = 9;
	      for (int i = 1; i <= 9 ; i++) {
	         System.out.printf("%d*%d=%d\n", dan, i, dan * i);
	      }
		 */

		EXIT:for (int dan = 2; dan < 10; dan++) {
			//System.out.printf("[%d단]\n", dan);
			for (int i = 1; i < 10; i++) {
				//if(i == 5) break EXIT;
				if(i == 5) continue EXIT;
				System.out.printf("%d*%d=%d\t", dan, i, dan*i);
			}
			System.out.println();

		}







	} // main

} // class
