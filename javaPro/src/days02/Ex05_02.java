package days02;

/**
 * @author lsh
 * @date 2024. 7. 2. - 오후 3:24:03
 * @subject 논리형 boolean 1 - t/f
 * @content
 *
 */
public class Ex05_02 {

	public static void main(String[] args) {
		// 남자, 여자 성별을 나타내는 변수 선언
		// t 1, f 0
		boolean gender;
		gender = true;
		
		System.out.printf("성별=%b\n", gender);
		// %[argument_index$][flags][width][.precision]conversion
		
        int x = 10;
        System.out.printf("%d\n", x);
        System.out.printf("%o\n", x);
        // System.out.printf("%x %X\n", x, x);
        System.out.printf("%1$x %1$X\n", x); //1$
	}

}
