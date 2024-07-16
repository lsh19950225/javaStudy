package days02;

public class Ex02 {

	public static void main(String[] args) {
		
		/*int i;
		i = 10;
		
		System.out.println(Integer.toBinaryString(i)); // 2
		System.out.println(Integer.toOctalString(i)); // 8
		System.out.println(Integer.toHexString(i)); // 16
		
		System.out.printf("%d\n", i); // 10
		System.out.printf("%#o\n", i); // 8
		System.out.printf("%#x\n", i); // 16
		System.out.printf("%#X\n", i); // 16
		
		int money;
		money = 23232323;
		System.out.printf("%,d\n", money);*/
		
		int i = Integer.MAX_VALUE;
		int j = 100;
		
		long k = (long) i + j ;
		
		System.out.printf("%d + %d = %d\n", i, j, k);

	}

}
