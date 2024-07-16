package days02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String name;
		int kor, eng, mat;
		long tot;
		double aaa;


		System.out.print("이름, 국어, 영어, 수학 ? ");
		name = scanner.next();
		kor = scanner.nextInt();
		eng = scanner.nextInt();
		mat = scanner.nextInt();

		tot = (long) (kor+eng+mat);
		aaa = (double) tot/3;

		System.out.printf("%s %d %d %d %d %f\n", name, kor, eng, mat, tot, aaa);





	}

}
