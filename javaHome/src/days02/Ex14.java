package days02;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int kor;
		boolean flag = false;
		do {
			if (flag) { 
				System.out.print("잘못 입력 다시!!!!");
			}
			flag = true;
			System.out.print("국어 점수 ? ");
			kor = scanner.nextInt();

		} while (!(kor >= 0 && kor <= 100));
		
		/*if (90<=kor) System.out.println("수");
		if (80<=kor && kor < 90) System.out.println("우");
		if (70<=kor && kor < 80 ) System.out.println("미");
		if (60<=kor && kor < 70) System.out.println("양");
		if (0<= kor && kor < 60) System.out.println("가");*/
		
		if (90<=kor) System.out.println("수");
		else if (kor>=80) System.out.println("우");
		else if (kor>=70) System.out.println("미");
		else if (kor>=60) System.out.println("양");
		else System.out.println("가");
		



	}

}
