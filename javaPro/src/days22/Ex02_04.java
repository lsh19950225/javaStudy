package days22;

import java.io.File;

/**
 * @author lsh
 * 	@date 2024. 7. 30. - 오전 10:33:25
 * @subject
 *	@content
 * 
 */
public class Ex02_04 {

	public static void main(String[] args) {
		
		String parent = ".\\src\\days22";
		// days22 폴더 안에 upload 폴더의 유무 확인한 후 없을 경우에 폴더를 생성
		File uploadDir = new File(parent,"upload");
		
		// System.out.println(uploadDir.exists());
		if (!uploadDir.exists()) {
			// day22\\upload\\temp
			// uploadDir.mkdir(); // 폴더가 없으면 생성안됨.
			// uploadDir.mkdirs(); // 없어도 만들어지면서 생성됨.
			System.out.println(uploadDir.mkdirs());
		} else {
			// upload 폴더 삭제..
			System.out.println(uploadDir.delete()); // 즉시 삭제
			// uploadDir.deleteOnExit(); // 임시파일을 삭제할 때 사용 : 프로그램이 종료 될 때 삭제
		}
		
	} // main

} // class
