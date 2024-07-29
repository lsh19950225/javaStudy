package days21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author lsh
 * 	@date 2024. 7. 29. - 오전 11:14:58
 * @subject Ex01.java -> Ex01Copy.java
 *	@content FileInputStream	FileOutputStream
 *								
 * 
 */
public class Ex06 {

	public static void main(String[] args) {

		String sourceFile = "C:\\Users\\User1\\Downloads\\ChromeSetup.exe";
		String copyFile = "C:\\Users\\User1\\Documents\\test\\ChromeSetup_copy.exe";
		
		// > 복사 처리 시간 : 2369425700(ns)
		fileCopyBinaryStream(sourceFile, copyFile);
		
	} // main

	private static void fileCopyBinaryStream(String sourceFile, String copyFile) {

		long start = System.nanoTime();

		try (FileInputStream fis = new FileInputStream(sourceFile);
				FileOutputStream fos = new FileOutputStream(copyFile)) {
			int code;
			while ((code = fis.read()) != -1) {
				System.out.printf("%08d\n", Integer.parseInt(Integer.toBinaryString(code)) );
				fos.write(code);
			}
			fos.flush();
			System.out.println("파일 복사 완료");
			
			long end = System.nanoTime();
			System.out.printf("> 복사 처리 시간 : %d(ns)\n", (end-start)); // 참고
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

} // class
