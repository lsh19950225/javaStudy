package days04;

import java.io.BufferedReader;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// 1.
		/*char uc = 'A';
		char lc = (char) (uc + 32);
		System.out.printf("%c", lc);*/

		// 2.
		/*int sum;
		sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i==10) {
				System.out.printf("%d", i);
			}else {
				System.out.printf("%d+", i);
			}
			sum += i;

		}
		System.out.printf("=%d\n", sum);*/

		/*int sum;
		sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.printf(i==10?"%d":"%d+", i);
			sum += i;
		}

		System.out.printf("=%d\n", sum);*/
		
		
		
		
		
		
		

		/*int sum;
		sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d+", i);
			sum+=i;
		}
		System.out.printf("=%d", sum);

		
		
		
		
		
		int i = 1;
		int sum = 0;
		
		while (i<=10) {
			System.out.printf("%d+",i);

			sum += i;
			i++;

		}
		System.out.printf("=%d\n",sum);*/
		
		
		
		
		
		
		

		//홍길동,송세호, 이시훈
		@SuppressWarnings("resource") // p556
		Scanner scanner = new Scanner(System.in);

		System.out.print("팀원 입력 ?");
		String data = scanner.nextLine();
		String regex = "\\s*,\\s*";
		String [] names = data.split(regex);

		for (int i = 0; i < names.length; i++) {
			System.out.printf("%d. 팀원 : %s\n", i+1, names[i]);
		} // for
		
		/*
		System.out.printf("1. 팀원 : %s\n", names[0]);
		System.out.printf("2. 팀원 : %s\n", names[1]);
		System.out.printf("3. 팀원 : %s\n", names[2]);
		*/








	} // main

} // class
