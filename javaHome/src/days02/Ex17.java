package days02;

public class Ex17 {

	public static void main(String[] args) {
		
		/*int i = 1;
		int sum = 0;
		while (i<=10) {
			if (i%2==1) {
				System.out.printf("%d+", i);	
				sum += i;
			}
			i++;
		}
		System.out.printf("=%d\n", sum);*/
		
		
		int sum = 0;
		int i = 1;
		//        참일 경우 계속 반복
		while ( i<= 10 ) {
			if ( i%2 != 0 ) {
				System.out.printf("%d+", i);
				sum += i;
			} // if
			i++;
		} // while
		System.out.printf("=%d\n", sum);
		
		
		
	}

}
