package days16;

/**
 * @author lsh
 * 	@date 2024. 7. 22. - 오후 5:25:05
 * @subject
 *	@content
 * 
 */
public class Ex08 { // 참고

	public static void main(String[] args) {
		
		// StringToknizer 클래스
		String s = "이시훈, 원충희, 김준석, 송세호";
		String regex = "\\s*,\\s*";
		String [] names = s.split(regex);

	} // main

} // class
