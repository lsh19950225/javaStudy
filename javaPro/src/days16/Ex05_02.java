package days16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author lsh
 * 	@date 2024. 7. 22. - 오후 2:48:21
 * @subject
 *	@content
 * 
 */
public class Ex05_02 {

	public static void main(String[] args) { // 강사님 참고

		// days16.Ex01.java 읽어와서
		// "예외" 문자열있는 위치값을 모두 출력..

		// String fileName = "C:\\Class\\Workspace\\javaStudy\\javaStudy\\javaPro\\src\\days16\\Ex01.java";
		String fileName = ".\\src\\days16\\Ex01.java";
		String content = getFileContent(fileName);

		System.out.println(content);
		
		/*
		// days11.Ex03.java  m배열에서 n(71) 모든 위치값..
		int index, fromIndex = 0;
		while (  (index = content.indexOf("예외", fromIndex) ) != -1  ) {
			System.out.println( index );
			fromIndex = index + 1;
		}
		*/
		
		// 예외 문자열을 모두 찾아서 삭제.
		content = content.replace("예외", "[예외]");
		
		//											regex
		// 홍길동 홍길남 홍길순
		// "홍길[가-힣]"
		// content = content.replaceAll("예외", "[예외]");
		
		
		// content = content.replace("예외", "");
		System.out.println(content);
		
	} // main

	private static String getFileContent(String fileName) {

		FileReader reader = null;

		// 버퍼 기능
		// readLine() 메서드 존재 : 한 라인을 읽어와서 반환하는 메서드
		BufferedReader bufferedReader = null;
		// String fileName = "C:\\Windows\\comsetup.log";

		int one = -1;
		String content = "";

		try {
			reader = new FileReader(fileName);
			// 보조스트림(2차 스트림) : 단독으로는 못씀. 1차 스트림 보조
			bufferedReader = new BufferedReader(reader);

			String line = null;
			int lineNumber = 1;

			while ( (line = bufferedReader.readLine()) != null) {
				//System.out.printf("%d : %s\n", lineNumber++, line);
				content += line + "\r\n";
			}

			System.out.println(line);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
					bufferedReader.close();

					reader = null;
					bufferedReader = null;
				} catch (IOException e) {
					e.printStackTrace();
				}	
			}
		} // try
		return content;
	}

} // class


