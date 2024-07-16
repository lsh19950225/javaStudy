package days04;

import java.util.Iterator;

/**
 * @author lsh
 * @date 2024. 7. 4. - 오후 3:40:02
 * @subject
 * @content
 *
 */
public class Ex_10 {

	public static void main(String[] args) {
		// for문
		/*int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d+",i);
			sum += i;
		}
		System.out.printf("=%d\n",sum);*/
		
		// while 문
		int i = 1;
		int sum = 0;
		
		while (i<=10) {
			System.out.printf("%d+",i);
				
			sum += i; // 둘이 바꾸면 2~11로 돈다.
			i++;		// 이거랑
			
		}
		System.out.printf("=%d\n",sum);

	} // main

} // class
