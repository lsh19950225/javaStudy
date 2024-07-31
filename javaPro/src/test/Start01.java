package test;

import java.util.Random;
import java.util.Scanner;

public class Start01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String p1;
		String p2;

		System.out.print("대결 상대 입력 ? ");

		p1 = scanner.next();
		p2 = scanner.next();

		int score1 = 0, score2 = 0;
		boolean vs;
		char con = 'y';
		Random rnd = new Random();

		while (score1 <= 40 || score2 <= 40 || score1 + score2 == 80) {
			vs = rnd.nextBoolean();

			if (vs == true) {
				score1 = getNextScore(score1);
			} else if (vs == false) {
				score2 = getNextScore(score2);
			}
		}
		System.out.printf("[%s] : %d\n[%s] : %d\n", p1, score1, p2, score2);

	} // main

	private static int getNextScore(int score) {
		switch (score) {
		case 0:
			return 15;
		case 15:
			return 30;
		case 30:
			return 40;
		default:
			return score;
		}
	}


}


