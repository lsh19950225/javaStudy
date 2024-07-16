package days09;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author lsh
 * @date 2024. 7. 11. - 오후 5:05:28
 * @subject
 * @content
 *
 */
public class Ex06 {

	public static void main(String[] args) throws IOException {
		// 1번 문제
		String name;
		int kor, eng, mat, tot, rank;
		double avg;
		
		final int STUDENT_COUNT = 25; // 상수로 설정
		
		String [] names = new String [STUDENT_COUNT];
		int [] kors = new int [STUDENT_COUNT];
		int [] engs = new int [STUDENT_COUNT];
		int [] mats = new int [STUDENT_COUNT];
		int [] tots = new int [STUDENT_COUNT];
		int [] ranks = new int [STUDENT_COUNT];
		double [] avgs = new double [STUDENT_COUNT];
		
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		char con = 'y';
		
		do {
			System.out.printf("%d번 학생 이,국,영,수 입력 ? ", count+1); // 1번 학생
			
			name = scanner.next();
			kor = scanner.nextInt();
			eng = scanner.nextInt();
			mat = scanner.nextInt();
			tot = kor + eng + mat;
			avg = (double)tot/3;
			rank = 1; // 모두 1등으로 해놓고 끝내고 한번에
			
			names[count] = name;
			kors[count] = kor;
			engs[count] = eng;
			mats[count] = mat;
			tots[count] = tot;
			avgs[count] = avg;
			ranks[count] = rank; // ++ 때문에 1씩 증가
			
			count ++; // 학생 1 증가
			// 입력 계속 ?
			System.out.print("학생 입력 계속 ? ");
			con= (char)System.in.read();
			System.in.skip(System.in.available());
			
		} while ( Character.toUpperCase(con) == 'Y'); // 대문자로 바꾸는 함수
		                   // con == 'Y' || con == 'y'
		
		System.out.printf("총 학생 수 :  %d\n", count); //  학생 수 = count
		
		for (int i = 0; i < count; i++) {
			System.out.printf("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n"
					,i+1, names[i],kors[i],engs[i],mats[i],tots[i],avgs[i],ranks[i]);
		}
		

	} // main

} // class
