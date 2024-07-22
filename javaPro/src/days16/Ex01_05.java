package days16;

import java.util.Scanner;

public class Ex01_05 {

	public static void main(String[] args) {

		// Scanner scanner = new Scanner(System.in);
		// scanner.close(); // gpt

		/*
		Scanner scanner = new Scanner(System.in);
		try {
			//
			//
			//
			//
		} catch (Exception e) {

		} finally {
			scanner.close();
		}
		 */

		// try~ resources 문 : ()	 - 사용하는 리소스(자원) : 자동으로 닫아준다.
		try (Scanner scanner = new Scanner(System.in);) {

		} catch (Exception e) {

		}

		try { // 중첩으로 올 수 있다.
			try {
				try {
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	} // main

} // class
