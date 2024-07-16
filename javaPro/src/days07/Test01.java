package days07;

public class Test01 {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) { // 행 갯수

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}


		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 5-i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}


		//      이등변삼각형
		//      __*  i=1  j=2   j=1
		//      _*** i=2  j=1   j=3
		//      *****i=3  j=0   j=5
		//              2*i-1
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i+j>=4 && j-i<=2?"*":"_");
				/*if (i+j>=4 && j-i<=2) {
					System.out.print("*");
				} else {
					System.out.print("_");
				}*/
			}
			System.out.println();
		}

		String rrn = "830412-1700001";
		String rrnArr = rrn.substring(0, 8);
		System.out.print(rrnArr + "******");
		System.out.println(); // 개행

		int first = 1;
		int second = 1;
		int next;
		int sum = first + second;
		System.out.printf("%d+%d+",first,second);

		//next=first+second;
		while ((next=first+second)<=100) {
			System.out.printf("%d+", next);
			sum += next;
			first = second;
			second = next;
			//next=first+second;
		}
		System.out.printf("=%d", sum);
		
		// 가변인자는 메서드로 전달되는 인자의 개수가 유동적일 때 사용 가능한 기능이며, 매개변수 타입 뒤에 ... 으로 선언한다.
		// 가변인자 내부에는 배열로 취급되며, 불필요한 오버로딩을 줄일 수 있다.
		
		/*.length();
		.charAt();
		.substring();
		.touppercase();
		.tolowercase();
		.split();
		.equals();
		.format();
		.trim();
		.nextline();
		.join();
		.tochararray();*/




	} // main

} // class
