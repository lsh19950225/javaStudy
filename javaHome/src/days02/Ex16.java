package days02;

public class Ex16 {

	public static void main(String[] args) {
		//		1~10까지의 홀수의 합( for문 )

		/*int sum = 0;
		for (int i = 1; i <= 10; i+=2) {
			if (i%2==1) {
				System.out.printf("%d+", i);
				sum+=i;
			}
			
		}
		System.out.printf("=%d\n", sum);*/
		
		int sum = 0;
		for (int i = 1; i <= 10; i+=1) {
			if (i%2==0) {
				System.out.printf("%d+", i);
			sum+=i;
			}
			
		}
		System.out.printf("=%d\n", sum);
		
		
		
	}

}
