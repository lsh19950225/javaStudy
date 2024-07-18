package days10;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author lsh
 * @date 2024. 7. 12. - 오전 11:27:33
 * @subject 배열 단점 -> 컬렉션 클래스 JCF
 * 					1. 배열이 다 차면 자동으로 늘어나지 않음 (개발자가 코딩으로 늘려야 함)
 * @content
 *
 */
public class Ex04 { // 다른 함수를 만들더라도 다 접근 가능

	static int index= 0;
	static char con = 'y';
	static Scanner scanner = new Scanner(System.in);
	static int [] m = new int [2];
	static int selectedNumber; // 선택된 메뉴 번호를 저장할 변수
	static String [] menus = {"추가","수정","삭제","검색","조회","종료"};

	public static void main(String[] args) throws IOException {
		while (true) { // true : 무한으로 돌림 // 6번으로 종료하지 않는 이상 계속 돈다.

			dispMenus(); // 메뉴 출력 함수
			selectMenus(); // 메뉴 선택 함수
			processMenus(); // 메뉴 처리

		} // while



	} // main

	// enum : 열거형 선언
	static final int ADD = 1; // 상수 : 가독성이 좋음
	static final int EDIT = 2; // 상수 : 가독성이 좋음

	private static void processMenus() throws IOException { // 처리
		switch (selectedNumber) {
		case ADD: // 추가
			add();
			break;
		case EDIT: // 수정
			break;
		case 3: // 삭제 : 뒤에 데이터가 매꿔짐
			delete();
			break;
		case 4: // 검색
			search();
			break;
		case 5: // 조회 : 배열의 모든 요소를 출력
			list();
			break;
		case 6: // 종료
			exit(); // 종료 함수
			break;
		default:
			break;
		} // switch
		일시정지();
	}

	private static void search() {
		
		
	}

	private static void delete() {
		System.out.println("3. 삭제");
		int deleteIndex; // 삭제할 위치값
		System.out.print("삭제할 index 입력 ? ");

		String regex = String.format("[0-%d]", index-1); // 인덱스 0~index-1 까지
		String inputData;
		do {
			System.out.println("삭제할 index 입력 ? ");
			inputData = scanner.next();	
		} while ( !inputData.matches(regex) );
		deleteIndex = Integer.parseInt(inputData);

		for (int i = deleteIndex+1; i < index; i++) {
			m[i-1] = m[i];
		}
		m[index-1] = 0;
		



	}

	private static void 일시정지() {
		System.out.print("Enter 누르면 계속");
		try {
			System.in.read();
			System.in.skip(System.in.available());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\n\n\n\n\n");



	}

	private static void list() {
		System.out.println("5. 조회");
		if (index == 0) { // 없다
			System.out.println("\t 추가된 요소가 없다.");
			return;
		} // if

		// 출력
		for (int i = 0; i < index; i++) {
			System.out.printf("m[%d]=%d ",i,m[i]);
		}
		System.out.println();
	}

	private static void add() throws IOException {
		System.out.println("1. 추가");
		do {
			if ( m.length == index ) {
				//				System.out.println("풀방");
				//				return;
				increaseArrayM();
			}
			System.out.println("정수 입력 ? ");
			int n = scanner.nextInt();
			m[index++] = n; // 0에서 1로

			System.out.print("계속 할거니 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available()); // 13, 10

		} while ( Character.toUpperCase(con)=='Y' );
	}


	private static void increaseArrayM() { // 배열 크기를 늘림

		int [] temp = new int [m.length + 3];
		//		for (int i = 0; i < m.length; i++) {
		//			temp[i] = m[i];
		//		}
		System.arraycopy(m, 0, temp, 0, m.length);
		m = temp;
	}

	private static void exit() { // 종료
		// return; 메서드를 빠져나감
		System.out.println("\n\n 프로그램 종료");
		System.exit(-1); // 아무값 줘도 상관 없다
	}

	private static void selectMenus() { // 선택
		String regex = "[1-6]";
		String inputData;
		do {
			System.out.println("메뉴 선택 ? "); // 1~6
			inputData = scanner.next();	
		} while ( !inputData.matches(regex) );
		selectedNumber = Integer.parseInt(inputData);
	}

	private static void dispMenus() { // 출력

		System.out.println("\t\t\t\t\t[메뉴]");
		for (int i = 0; i < menus.length; i++) {
			System.out.printf("[%d]%s\t", i+1, menus[i]);
		}

	} // dispMenus

} // class