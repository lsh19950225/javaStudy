package days23;

import java.io.File;
import java.util.stream.Stream;

public class Ex08 {

	public static void main(String[] args) {
		// 클래스 배열 초기화
		File [] fileArr = {
				new File("Ex1.java"), 
				new File("Ex1.bak"), 
				new File("Ex2.java"), 
				new File("Ex1"), 
				new File("Ex1.txt")
		};
		
		// Stream<File> s = Stream.of(fileArr);
		// map() 스트림의 요소를 변환
		// Stream<String> s2 = s.map(File::getName); // 메서드 참조
		
		// 모든 파일명만 출력..
		// s2.forEach(System.out::println);
		
		Stream<File> fs = Stream.of(fileArr);
		fs.map(File::getName).filter(s-> s.indexOf('.') != -1) // 확장자가 없는 파일명은 제외
		.map(s-> s.substring(s.indexOf('.')+1)) // 확장자만 추출
		.distinct() // 중복제거
		.forEach(System.out::println);

	} // main

} // class
