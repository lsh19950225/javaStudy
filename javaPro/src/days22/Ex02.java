package days22;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

/**
 * @author lsh
 * 	@date 2024. 7. 30. - 오전 9:16:33
 * @subject
 *	@content
 * 
 */
public class Ex02 {

	public static void main(String[] args) {
		
		String currentDirectory = System.getProperty("user.dir");
		// System.out.println(currentDirectory);
		
		File parent = new File(currentDirectory);
		// System.out.println(parent.isDirectory());
		
		// 하위 폴더, 파일 조회..
		// String [] 	parent.list(); // 하위 디렉토리 + 파일 목록
		// String [] 	parent.list(filter); // 필터링된 하위 디 + 파일 목록
		// File [] 		parent.listFiles();
		// File [] 		parent.listFiles(filter);
		
		/*String [] list = parent.list();
		for (int i = 0; i < list.length; i++) {
			
			System.out.print(list[i] + "/");
			File child = new File(parent, list[i]);
			System.out.println(child.isFile() ? "파일" : "폴더");
			
		} // for*/
		
		File [] list = parent.listFiles();
		for (int i = 0; i < list.length; i++) {
			File child = list[i];
			String name = list[i].getName();
			long ms = child.lastModified();
			
			String pattern = "yyyy-MM-dd a h:mm";
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			
			System.out.printf("%s\t%s\t%s\t%s\n", child.isFile() ? "파일" : "폴더", name, child.length());
		}
	} // main

} // class
