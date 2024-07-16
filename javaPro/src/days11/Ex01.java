package days11;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		// 복습문제 풀이
		
		/*int [] m = {1,2,3};
		int [] n = new int [m.length+1];
		int index = 1;
		System.arraycopy(m, 0, n, 0, index);
		n[index] = 4;
		System.arraycopy(m, 1, n, index+1, m.length-1);
		System.out.println(Arrays.toString(n));*/

		
		
		
		int [] m = {1,2,3,4,5,6};
		int [][] n = new int[2][3];

		// i=0              0 0
		// i=1              0 1
		// i=2              0 2
		// i=3              1 0
		// i=4              1 1
		// i=5              1 2
		
		for (int i = 0; i < m.length; i++) {
			System.out.printf("%d - [%d][%d] \n"
					, i, i/(n[0].length), i%(n[0].length));
			n[i/n[0].length][i%n[0].length] = m[i];
		}
		
		for (int i = 0; i < n.length; i++) {
			System.out.println(Arrays.toString(n[i]));
		}
		
	} // main

} // class
