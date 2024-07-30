package days22;

import java.io.File;
import java.io.IOException;

/**
 * @author lsh
 * 	@date 2024. 7. 30. - 오전 9:00:46
 * @subject 자바 IO
 *	@content 팀 프로젝트 진행
 *
 * 
 */
public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		// [File 클래스]
		//		ㄴ 파일, 디렉토리
		
		String pathname = ".\\src\\days21\\Ex01.java";
		// String pathname = "C:\\Class\\Workspace\\javaStudy\\javaStudy\\javaPro";
		File file = new File(pathname);
		System.out.println(file.getParent()); // .\src\days21
		System.out.println(file.getName()); // Ex01.java
		System.out.println(file.getPath()); // .\src\days21\Ex01.java
		// 절대경로
		System.out.println(file.getAbsolutePath());
		// 표준경로
		System.out.println(file.getCanonicalPath());
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.length()); // byte
		System.out.println(file.exists()); // 파일 존재 유무
		
		// OS에서 사용하는 경로 구분자: ;
		System.out.println(file.pathSeparator);
		// OS에서 사용하는 이름 구분자 : \\
		System.out.println(file.separator);
		
		String fileName = file.getName();
		// 확장자
		// 확장자를 제외한 파일명 : 해보기
		int idx = fileName.indexOf(".");
		fileName.substring(0, idx);
		
	} // main

} // class
