package days22;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author lsh
 * 	@date 2024. 7. 30. - 오전 11:37:30
 * @subject
 *	@content
 * 
 */
public class Ex02_06 {

	public static void main(String[] args) {
		
		String parent = ".\\src\\days22";
		
		String child = "시간표_(5강의실)(디지털컨버전스)AWS 클라우드와 Kafka를 활용한 Java(자바) Full-Stack 개발자 양성과정(E).xlsx";
		// 10KB 양성과정(E)_1.xlsx
		// 10KB 양성과정(E)_2.xlsx
		File file = new File(parent, child);
		System.out.println("파일크기 : " + file.length() + "(byte)");
		
		final int VOLUME = 10*1024; // 10KB
		
		String baseName = getBaseFileName(child); // ~양성과정(E)
		String ext = getExtension(child); // .xlsx
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		int code = 0;
		int index = 0; // 양성과정(E)_3.xlsx
		int i = 0; // 읽어온 바이트 수
		
		try (FileInputStream fis = new FileInputStream(file);
				BufferedInputStream bis = new BufferedInputStream(fis);) {
			
			while (( code=bis.read() ) != -1) {
				if (i % VOLUME == 0) {
					if (i != 0) bos.close(); // 파일을 저장.
					// 양성과정(E)_1.xlsx
					child = String.format("%s_%d%s",baseName,++index,ext);
					
					File temp = new File(parent, child);
					fos = new FileOutputStream(temp);
					bos = new BufferedOutputStream(fos);
				}
				
				bos.write(code);
				
				i++;
			}
			
			bos.close(); // 파일 저장.
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	} // main

	// 확장자를 반환하는 메서드 "a.txt"
	public static String getExtension(String fileName) {
		
		int pos = fileName.indexOf(".");
		
		return fileName.substring(pos);
	}
	
	// 확장자를 제외한 파일명을 반환하는 메서드
	public static String getBaseFileName(String fileName) {
		
		int pos = fileName.indexOf(".");
		
		return fileName.substring(0, pos);
	}

} // class
