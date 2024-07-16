package days02;

/**
 * @author lsh
 * @date 2024. 7. 2. - 오후 2:36:04
 * @subject (암기) 두 기억공간의 값을 바꾸기.
 * @content
 *
 */
public class Ex04_02 {

	public static void main(String[] args) {
		/*
		int x = 10;
		int y = 20;
		*/
		
		// 콤마연산자
		int x = 10, y = 20;
		System.out.printf("교환 전 > x=%d, y=%d\n", x, y);
		// 두 기억공간의 값을 바꾸기 - 임시기억공간
		{
			int temp; // 10
			temp = x;
			x = y; // x = 20
			y = temp; // y = 10	
		}
		System.out.printf("교환 후 > x=%d, y=%d\n", x, y);
		

	}

}
