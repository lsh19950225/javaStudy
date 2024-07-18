package days14;

/**
 * @author lsh
 * 	@date 2024. 7. 18. - 오전 10:13:47
 * @subject
 *	@content
 * 
 */
public class Ex02 {

	public static void main(String[] args) {
		
		Document doc1 = new Document();
		Document doc2 = new Document("Sample.txt");
		Document doc3 = new Document();
		Document doc4 = new Document();
		
		System.out.println(" end ");

	} // main

} // class

class Document {
	String fileName = "Noname"; // 명시적 초기화
	static int count = 1; // 프로그램 시작과 동시에 메모리에 올라가서 공유해서 쓴다.
	
	public Document(String fileName) {
		this.fileName = fileName;
		System.out.printf("\"%s\" 문서가 생성되었습니다.\n", this.fileName);
	}

	public Document() {
		this( "Noname" + count++ );
	}
}