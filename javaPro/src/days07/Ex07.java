package days07;

import java.util.Random;

public class Ex07 {

	public static void main(String[] args) {

		// [로또6/45 게임]
		// 1 ~ 45
		// 1 <= (int)(Math.random()x45)+1 < 46

		//Random rnd = new Random();
		//rnd.nextInt(45)+1;

		int lottoNumber;

		int [] lotto = new int[6];

		/*
				for (int i = 1; i <= 6; i++) {
					lottoNumber = (int)(Math.random()*45)+1;
					System.out.printf("[%d]",lottoNumber);
				}
				System.out.println();
		 */
		fillLotto(lotto);

		dispLotto(lotto);


	} // main

	//                 ??
	//                 ↓
	//[16][30][11][22][0][0]
	private static void fillLotto(int[] lotto) {
		int lottoNumber;
		/*
				for (int i = 0; i < lotto.length; i++) {
					lottoNumber = (int)(Math.random()*45)+1;
					lotto[i] = lottoNumber;
				}
		 */
	}

	private static void dispLotto(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%d]",lotto[i]);
		}
		System.out.println();
	}

} // class
