package test;

import java.util.Random;
import java.util.Scanner;

public class Start02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String p1;
		String p2;

		//System.out.print("대결 상대 입력 ? ");
		
		//p1 = scanner.next();
		//p2 = scanner.next();
		
		int [] score1 = {0, 15, 30, 40};
		int [] score2 = {0, 15, 30, 40};
		
		boolean vs;
		char con = 'y';
		Random rnd = new Random();
		
		int x = 0;
		int y = 0;
		
		while (x < 5 || y <5) {
			int i = rnd.nextInt(2);
			if (i == 0) {
				x++;
				System.out.println("x="+x);
			} else {
				y++;
				System.out.println("y="+y);
			}
			
			if (x == 4 && y == 4) {
				
			} else {
				
			}
			
		}
		
		/*
		while (x == 40 && y == 40) {
			vs = rnd.nextBoolean();

			if (vs) {
				for (int i = 0; i < score1.length; i++) {
					System.out.printf("%d", score1[i]);
					x = score1[i];
				} 
			} else if (!vs) {
				for (int i = 0; i < score2.length; i++) {
					System.out.printf("%d", score2[i]);
					y = score1[i];
				} 
			}
		}

		if (xf) {
			
		}
		*/
	} // main

} // class
