package days15;

/**
 * @author lsh
 * 	@date 2024. 7. 19. - 오후 4:52:13
 * @subject
 *	@content
 * 
 */
public class Ex11 {

	public static void main(String[] args) {
		
		String parsingFile = "hello.html";
		String docType = "html";
		
		Parseable parser = ParserManager.getParser(docType);
		parser.parse(parsingFile);
		
		System.out.println("end");

	} // main

} // class

interface Parseable {
	void parse(String fileName); // 파일명 파싱(구문분석)하는 메서드
	default void print() {}
}

class XMLparser implements Parseable {

	@Override
	public void parse(String fileName) {
		System.out.println("XML파일 구문 분석 코딩");
		
	}
	public void print() {
		System.out.println(" XML파일 구문 분석 후 인쇄 코딩");
	}
	
}

class HTMLparser implements Parseable {

	@Override
	public void parse(String fileName) {
		System.out.println("HTML파일 구문 분석 코딩");
		
	}
	
}

class ParserManager { // 강사님 참고
	public static Parseable getParser(String docType) {
		if (docType.equals("xml")) {
			return new XMLparser();
		} else if (docType.equals("html")) {
			return new HTMLparser();
		} else {
			return null;
		}
	}
}


