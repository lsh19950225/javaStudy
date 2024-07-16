package days05;

import java.util.Scanner;

public class Ex03_02 {

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
		
		// jdk 14 는 case 10, 9: 로 사용가능
		char grade;
		switch (kor/10) {
		case 9: // 입력하지 않으면 다음으로 넘어간다.
			grade = '수';
			//break;
		case 8:
			grade = '우';
			//break;
		case 7:
			grade = '미';
			//break;
		case 6:
			grade = '양';
			//break;
			
		default:
			grade='가';
			//break;
		}
		System.out.printf("%d : %c\n", kor, grade);




	} // main

}// class
