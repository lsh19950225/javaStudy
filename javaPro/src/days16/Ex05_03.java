package days16;

/**
 * @author lsh
 * 	@date 2024. 7. 22. - 오후 3:40:58
 * @subject
 *	@content
 * 
 */
public class Ex05_03 {

	public static void main(String[] args) {
		
		String [] urlArr = {
				"www.naver.com",
				"http://www.naver.com",
				"http://www.sist.co.kr",
				"https://www.daum.net"
		};
		// String regex = "^http://";			[^0-9]와 다름
		// String regex = ".com$";
		for (int i = 0; i < urlArr.length; i++) {
			//if (urlArr[i].startsWith("http://"))
			if (urlArr[i].endsWith(".com"))
			System.out.println(urlArr[i]);
		}

	}

}
