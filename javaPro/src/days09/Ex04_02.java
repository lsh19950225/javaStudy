package days09;

public class Ex04_02 {

	public static void main(String[] args) {

		int n =10;                        // 8진수 출력
		int share, reminder;

		String octal = ""; // : 빈 문자열

		while (n != 0) {
			share = n/8;
			reminder = n%8;
			//System.out.printf("%d", reminder);
			octal = reminder + octal; // "12"
			n = share;
		}
		octal = "0"+ octal;
		System.out.println(octal);




		/*
		int share, reminder;
		int [] binaryArr = new int [32];

		int index = binaryArr.length-1;
		while (n != 0) {
			share = n/8;
			reminder = n%8;
			binaryArr[index--] = reminder;
			n = share;
		}

		for (int i = 0; i < binaryArr.length; i++) {
			System.out.printf("%d", binaryArr[i]);
			if(i%8==7) System.out.print(" ");
		}
		System.out.println();
		 */







	} // main

} // class
