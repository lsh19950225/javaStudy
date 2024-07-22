package days16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author lsh
 * 	@date 2024. 7. 22. - 오후 4:07:42
 * @subject
 *	@content
 * 
 */
public class Ex06 { // 강사님 참고

	public static void main(String[] args) {
		
		String fileName = ".\\src\\days16\\SS21.txt";
		
		String [] nameArr = getFileContent(fileName);
		
		String content = "<ol><li>" + String.join("</li><li>", nameArr) + "</li></ol>";
		
		// System.out.println(System.getProperty("user.dir")); // C:\Class\Workspace\javaStudy\javaStudy\javaPro

	} // main
	
	// Ex05_02.java
	private static String [] getFileContent(String fileName) {

		FileReader reader = null;
		BufferedReader bufferedReader = null;

		int one = -1;
		String [] nameArr = new String[10];

		try {
			reader = new FileReader(fileName);
			// 보조스트림(2차 스트림) : 단독으로는 못씀. 1차 스트림 보조
			bufferedReader = new BufferedReader(reader);

			String line = null;
			int index = 0;
			
			while ( (line = bufferedReader.readLine()) != null) {
				nameArr[index++] = line;
				// content += line + "\r\n";
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
		return nameArr;
	}

} // class
