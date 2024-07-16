package days08;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author lsh
 * @date 2024. 7. 10. - 오전 9:47:42
 * @subject
 * @content
 *
 */
public class Ex02 {

	public static void main(String[] args) {

		// 검색(search)
		// 1) 순차검색 (Sequence search)
		// 2) 이진검색 (Binary search)
		Scanner scanner = new Scanner(System.in);
		int [] m = new int [20];
		// 1~100 임의의 정수
		fillM(m);
		dispM(m);

		//Scanner scanner = new Scanner(System.in);
		//System.out.print("정수 입력 ? ");
		//int searchNumber = scanner.nextInt();

		int searchNumber = getSearchNumber(scanner);
		int  index = sequenceSearch(m, searchNumber);

		if (index == -1)
			System.out.println("찾는 정수 없다.");
		else
			System.out.printf("찾는 정수 %d 인덱스 위치에 있다.", index);

	} // main

	private static int sequenceSearch(int[] m, int searchNumber) {
		int index = -1;
		for (int i = 0; i < m.length; i++) {
			if(m[i] == searchNumber) {
				index = i;
				break;
			}
		}
		
		return index;
	}

	private static int getSearchNumber(Scanner scanner) {
		// * : 0~무한대
		// + : 1~
		// ? : 0 1
		String regex = "\\d+";
		String strSearchNumber;
		// + : 한개 오던지 여러개 오던지
		do {
			System.out.print("정수 입력 ? ");
			strSearchNumber = scanner.next();
		} while (!strSearchNumber.matches(regex));
		
		int searchNumber = Integer.parseInt(strSearchNumber);
		return searchNumber;
		
		
		
	}

	private static void fillM(int[] m) {
		for (int i = 0; i < m.length; i++) {
			int rnd;
			rnd = (int)(Math.random()*100)+1;
			m[i] = rnd;
		}

	}

	private static void dispM(int[] m) {
		System.out.println(Arrays.toString(m));

	}

} // class
