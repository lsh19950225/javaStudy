package days22;

import java.io.File;
import java.io.IOException;

public class Ex02_05 {

	public static void main(String[] args) throws IOException {
		// https://needjarvis.tistory.com/742
		// 람다와 스트림 코딩 이해.

		/*
		 * days22
		 * 		ㄴ temp 폴
		 * 			ㄴ a.txt 파
		 * 			ㄴ b.txt 파
		 * 			ㄴ subtemp 폴
		 * 					ㄴ c.txt 파일
		 */

		/*String pathname = ".\\src\\days22\\temp\\subtemp";
		File f = new File(pathname);
		f.mkdirs();
		//
		File atxt = new File(".\\src\\days22\\temp\\a.txt");
		atxt.createNewFile();
		File btxt = new File(".\\src\\days22\\temp\\b.txt");
		btxt.createNewFile();
		File ctxt = new File(".\\src\\days22\\temp\\subtemp\\c.txt");
		ctxt.createNewFile();*/

		String pathname = ".\\src\\days22\\temp";
		File f = new File(pathname);

		if(f.exists()) {
			// System.out.println( f.delete());
			// 하위 디렉토리 + 파일이 없어야 삭제할 수 있다.
			// 재귀함수

			scanDelete(f);
			f.delete();
			System.out.println(f.getName()+" 폴더 삭제");

		}
		System.out.println("end");

	} // main

	private static void scanDelete(File f) {

		File[] files = f.listFiles();

		for (File file : files) {
			if (file.isFile()) {
				file.delete();
				System.out.println(file.getName()+" 파일 삭제");
			} else {
				scanDelete(file.getAbsoluteFile());
				file.delete();
				System.out.println(file.getName()+" 폴더 삭제");
			}
		}

	}

} // class
