package days10;

import java.util.Arrays;

public class Test04 {

	public static void main(String[] args) {
		
		/*int [] i = {3,5,2,4,1};
		
		System.out.println(Arrays.toString(i));
		
		int [] m = new int [i.length+3];
		
		System.arraycopy(i, 0, m, 1, 5);
		
		System.out.println(Arrays.toString(m));*/
		
		int [] i = {1,2,3};
		
		int [] m = new int [i.length+1];
		
		System.arraycopy(i, 0, m, 0, 3);
		
		m[i.length] = 4;
		
		System.out.println(Arrays.toString(m));

	}

}
