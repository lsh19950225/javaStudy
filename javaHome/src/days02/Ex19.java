package days02;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		int com, user;
		Scanner scanner = new Scanner(System.in);

		com = (int)(Math.random()*3)+1;

		System.out.print("가위1 바위2 보3 선택 ? ");
		user = scanner.nextInt();

		String strUser = "가위";
		if (user == 2) strUser = "바위";
		else if (user == 3) strUser = "보";

		String strCom = "가위";
		if (com == 2) strCom = "바위";
		else if (com == 3) strCom = "보";

		System.out.printf("사용자 : %s, 컴퓨터 : %s\n", strUser, strCom);

		//		사람 승리 : 1 , -2
		//		무승부    : 0
		//		컴   승리 : 2 , -1

		/*switch (user - com) {
		case 0:
			System.out.println("무승부");
			break;
		case 1: case -2:
			System.out.println("사용자 승리");
			break;
		default:
			System.out.println("컴퓨터 승리");
			break;
		}*/
		
		
		
		int 판단 = user - com;
		if (판단 == 0) {
			System.out.println("무승부");
		} 
		else if (판단 == 1 || 판단 == -2) {
			System.out.println("사용자 승리");
		}
		else {
			System.out.println("컴퓨터 승리");
		}
		
		

	}

}
