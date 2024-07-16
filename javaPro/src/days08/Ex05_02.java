package days08;

/**
 * @author lsh
 * @date 2024. 7. 10. - 오후 5:17:42
 * @subject
 * @content
 *
 */
public class Ex05_02 {

	public static void main(String[] args) {
		
		int x = 10, y = 20;
	      System.out.printf("> 1. main  x=%d, y=%d\n", x, y);
	      /*
	      int temp = x;
	      x = y;
	      y = temp;
	      */
	      swap (x, y); // 3. Call By Reference
	      System.out.printf("> 2. main  x=%d, y=%d\n", x, y);
		

		
		
		
	} // main

	private static void swap(int x, int y) {
		int temp = x;
	      x = y;
	      y = temp;
	}

} // class
