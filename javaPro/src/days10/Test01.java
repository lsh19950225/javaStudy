package days10;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {

		int [] m = {3,5,2,4,1};
		//[3, 5, 2, 4, 1]
		// 0-1 1-2 2-3 3-4  i=0   j=3
		// 0-1 1-2 2-3      i=1   j=2
		// 0-1 1-2          i=2   j=1
		// 0-1              i=3   j=0
		bubbleSort(m);
		// Arrays.sort(m); // 오름차순 정렬
		System.out.println(Arrays.toString(m));




	} // main

	private static void bubbleSort(int[] m) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= 3-i; j++) {
				System.out.printf("%d-%d", j, j+1);
				if (m[j]<m[j+1]) {
					System.out.print("change");
					int temp;
					temp = m[j];
					m[j] = m[j+1];
					m[j+1] = temp;
				}
				System.out.println(Arrays.toString(m));
			}
			System.out.println();
		}

	}



} // class
