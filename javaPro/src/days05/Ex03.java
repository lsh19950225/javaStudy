package days05;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		// 1. 국어점수를 입력받아서 수/우/미/양/가 출력(if문)
		// 2. 국어점수를 입력받아서 수/우/미/양/가 출력(switch문)
		// 3. 1~10까지의 홀수의 합(for문)
		// 4. 1~10까지의 홀수의 합(while문)
		// 5. 두 정수(n,m)을 입력받아서 두 정수 사이의 합을 출력(for문, while문)

		Scanner scanner = new Scanner(System.in);
		int kor;
		boolean flag = false;
		do {
			if (flag) {
				System.out.print("입력잘못!\n다시 ");
			} // if
			flag= true;
			System.out.print("국어점수 입력 ? ");
			kor = scanner.nextInt();
			// art + 방향키 : 이동
		} while (!(kor >= 0 && kor <= 100));
		//} while (kor < 0 || kor > 100);
		
		// 입력한 값들은 항상 [유효성 검사]가 필요하다.
		// 수우미양가 출력~
		
		
			
		
		if (90<=kor && kor <= 100) System.out.println("수");
		if (80<=kor && kor < 90) System.out.println("우");
		if (70<=kor && kor < 80) System.out.println("미");
		if (60<=kor && kor < 70) System.out.println("양");
		if (0<=kor && kor < 60) System.out.println("가");
			
		/*if (90 <= kor ) System.out.println("수");
		else if (80 <= kor ) System.out.println("우");
		else if (70 <= kor ) System.out.println("미");
		else if (60 <= kor ) System.out.println("양");
		else System.out.println("가");*/





	} // main

		}// class
