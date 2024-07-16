package days02;

import java.util.Scanner;

public class Ex15 {

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
		} while (!(kor>=0 && kor <= 100));

		char grade;
		switch (kor/10) {
		case 9:
			grade = '수';
			break;
		case 8:
			grade = '우';
			break;
		case 7:
			grade = '미';
			break;
		case 6:
			grade = '양';
			break;

		default:
			grade = '가';
			break;
		}
		System.out.printf("%d : %c\n", kor, grade);

		


	}

}
