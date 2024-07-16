package days07;

/**
 * @author lsh
 * @date 2024. 7. 9. - 오후 2:01:50
 * @subject
 * @content
 *
 */
public class Ex04 {

	public static void main(String[] args) {

		//2.
		/*int firstTerm = 1;
		int secondTerm = 1;
		int nextTerm ;
		int sum = firstTerm + secondTerm;
		System.out.printf("%d+%d+", firstTerm, secondTerm);

		while( true ) {
			nextTerm = firstTerm + secondTerm;
			if(nextTerm>100) break;
			System.out.printf("%d+", nextTerm);
			sum += nextTerm;

			firstTerm = secondTerm;
			secondTerm = nextTerm;
		} // while

		System.out.printf("=%d\n", sum );*/

		// 3.
		/*int firstTerm = 1;
		int secondTerm = 1;
		int nextTerm ;
		int sum = firstTerm + secondTerm;
		System.out.printf("%d+%d+", firstTerm, secondTerm);
		
		nextTerm = firstTerm + secondTerm;
		while( nextTerm <= 100 ) {
			// if(nextTerm>100) break;
			System.out.printf("%d+", nextTerm);
			sum += nextTerm;

			firstTerm = secondTerm;
			secondTerm = nextTerm;
			nextTerm = firstTerm + secondTerm;
		} // while

		System.out.printf("=%d\n", sum );*/
		
		
		//4.
		
		int firstTerm = 1;
		int secondTerm = 1;
		int nextTerm ;
		int sum = firstTerm + secondTerm;
		System.out.printf("%d+%d+", firstTerm, secondTerm);
		
		//nextTerm = firstTerm + secondTerm;
		while( (nextTerm = firstTerm + secondTerm) <= 100 ) {
			System.out.printf("%d+", nextTerm);
			sum += nextTerm;

			firstTerm = secondTerm;
			secondTerm = nextTerm;
			//nextTerm = firstTerm + secondTerm;
		} // while

		System.out.printf("=%d\n", sum );




	} // main

} // class
