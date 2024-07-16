package days10;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Ex01_02 {

	static String name;
	static int kor, eng, mat, tot, rank;
	static double avg;

	static final int STUDENT_COUNT = 30;

	static String [] names = new String [STUDENT_COUNT];
	static int [] kors = new int [STUDENT_COUNT];
	static int [] engs = new int [STUDENT_COUNT];
	static int [] mats = new int [STUDENT_COUNT];
	static int [] tots = new int [STUDENT_COUNT];
	static int [] ranks = new int [STUDENT_COUNT];
	static double [] avgs = new double [STUDENT_COUNT];

	static Scanner scanner = new Scanner(System.in);
	static int count = 0;
	static char con = 'y';


	public static void main(String[] args) throws IOException {

		studentInfomationInput(); // 호출만 안받고 안넘겨도됨

		studentInfomationOutput(); //

	} // main

	private static void studentInfomationOutput() {

		System.out.printf("총 학생 수 :  %d\n", count);

		for (int i = 0; i < count; i++) {
			System.out.printf("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n"
					,i+1, names[i],kors[i],engs[i],mats[i],tots[i],avgs[i],ranks[i]);
		}


	}

	public static void processRank() {  // 강사님 참고
		for (int i = 0; i < count; i++) {
			ranks[i]=1;
			for (int j = 0; j < count; j++) {
				if (tots[i] < tots[j]) ranks[i]++;
			}
		}
	}

	private static void studentInfomationInput() throws IOException { // scanner 추가

		do {

			System.out.printf("%d번 학생 이,국,영,수 입력 ? ", count+1);

			name = getName();// scanner.next();
			kor = getScore();// scanner.nextInt();
			eng = getScore();// scanner.nextInt();
			mat = getScore();// scanner.nextInt();
			tot = kor + eng + mat;
			avg = (double)tot/3;
			rank = 1;

			names[count] = name;
			kors[count] = kor;
			engs[count] = eng;
			mats[count] = mat;
			tots[count] = tot;
			avgs[count] = avg;
			ranks[count] = rank;

			count ++;

			System.out.print("학생 입력 계속 ? ");
			con= (char)System.in.read();
			System.in.skip(System.in.available());

		} while ( Character.toUpperCase(con) == 'Y');
		
		processRank();
		
	}

	private static String getName() {
		// 성 128개
		Random rnd = new Random();
		String [] lastNames = {"김","이","박","최","권","홍"};
		int index = rnd.nextInt(lastNames.length);
		String name = lastNames[index];
		//이름 : 2문자
		char [] firstName = new char[2];
		for (int i = 0; i < firstName.length; i++) {
			firstName[i] = (char) (rnd.nextInt('힣'-'가'+1) + '가'); // 가에서부터 힣까지의 한 문자를 배열에
		}
		// Char[] -> String
		// String firstName = String.valueOf(firstNames); // 강사님 참고

		name += firstName;

		return name;
	}

	public static int getScore() {
		return (int) (Math.random()*101);
	}





} // class


