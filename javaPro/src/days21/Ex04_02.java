package days21;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex04_02 {

	public static void main(String[] args) {

		// 실행 후
		// 1. 저장할 파일명 입력 ? test.txt 입력 엔터
		// 2. 저장할 문자열(Data) 입력 ? 문자열 입력.. 엔터
		//		계속 ? y, n

		String parent = ".\\src\\days21";
		String child;
		char con = 'y';
		String content;

		try (Scanner scanner = new Scanner(System.in)){

			System.out.print("1. 저장할 파일명 입력 ? ");
			child = scanner.next();

			File file = new File(parent, child);

			do {
				try (FileWriter writer = new FileWriter(file, true)){ // 추가.
					System.out.print("2. 저장할 문자열 입력 ? ");
					content = scanner.next();
					writer.write(content); // 쓰기, + "\r\n" : 개행.
				} catch (Exception e) {
					e.printStackTrace();
				}

				System.out.print("계속 ? ");
				con = (char)System.in.read();
				System.in.skip(System.in.available());

			} while (Character.toUpperCase(con)=='Y');

		} catch (Exception e) {
			e.printStackTrace();
		}// try

	} // main

} // class
