package days22;

import java.io.File;
import java.io.FilenameFilter;
import java.util.stream.Stream;

/**
 * @author lsh
 * 	@date 2024. 7. 30. - 오전 9:44:46
 * @subject
 *	@content
 * 
 */
public class Ex02_02_02 {

	public static void main(String[] args) {

		String pathname = ".\\src\\days21";
		// days21 폴더 안에서	자바파일(.java)만 조회
		File file = new File(pathname);
		
		/*File [] list = file.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				
				return name.endsWith(".java");
			}
		});*/
		
		File [] list = file.listFiles((a,b)->b.endsWith(".java"));
		
		for (int i = 0; i < list.length; i++) {
			File f = list[i];
			System.out.println(f.getName());
		}

	} // main

} // class
