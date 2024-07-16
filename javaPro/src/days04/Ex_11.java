package days04;

import java.util.Iterator;

/**
 * @author lsh
 * @date 2024. 7. 4. - 오후 4:12:01
 * @subject
 * @content
 *
 */
public class Ex_11 {

	public static void main(String[] args) {
		// continue 문
		// [for문]
		/*int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if(i==5) continue;
			System.out.printf("%d+",i); 
			sum += i;
		}
		System.out.printf("=%d",sum);*/

		// 2.
		/*int i = 1 , sum = 0;
		while (i<=10) { // 4<=10 참

			if (i==5) { 
				i++;
				continue;
			}
			System.out.printf("%d+",i);
			sum+=i;
			i++;

		}
		System.out.printf("=%d\n",sum);*/

		// 3.
		int i = 0 , sum = 0;
		while (++i<=10) {

			if (i==5) continue;
			System.out.printf("%d+",i);
			sum+=i;


		}
		System.out.printf("=%d\n",sum);
		




	} // main

} // class
