package days10;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		int [] m = { 0, 4, 5, 15, 20, 21, 22, 24, 25, 28, 29, 30
				, 32, 33, 40, 43, 46, 47, 48, 58, 62, 63, 71, 76, 
				86, 91, 94, 99, 111, 116, 128, 135, 137, 139, 142
				, 145, 146, 150, 151, 160, 161, 166, 168, 
				169, 172, 181, 184, 185, 191, 198 };

		int n = 3;
		int index = binarySearch(m, n);

		if (index == -1) {
			System.out.print("찾는 정수 없다.");
		} else {
			System.out.printf("찾는 정수 %d 인덱스에 있다.", index);
		}


	}

	private static int binarySearch(int[] m, int n) {
		int top = m.length-1;
		int bot = 0;
		int mid;
		int count = 0;
		while (top>=bot) {
			mid = (top+bot)/2;
			System.out.printf("%d 횟수\n", ++count);
			if (m[mid] == n) return mid;
			else if (m[mid] > n) top = mid-1;
			else if (m[mid] < n) bot = mid+1;
		}
		return -1;
	}


}
