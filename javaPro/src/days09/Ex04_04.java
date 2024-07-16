package days09;
/**
 * @author lsh
 * @date 2024. 7. 11. - 오후 3:16:32
 * @subject
 * @content
 *
 */
public class Ex04_04 {

	public static void main(String[] args) {
		// 10진수 -> 16진수 출력
		// 125         0x7D
		int n = 125;
		int share, reminder;
		String hex = "";

		char[] ch = {'0','1','2','3','4','5','6','7','8','9','a', 'b', 'c', 'd', 'e', 'f'};
		while (n != 0) { // 또는 n != 0
			share = n/16;
			reminder = n%16;
			// System.out.printf("%d", reminder);
			hex = ch[reminder] + hex;
			n = share; // 몫
		} // while

		hex = "0x"+hex;
		System.out.println(hex);
		
		// 나중에 보면 좋을 것 참고.
		/*// 10 진수 정수 => 16진수 출력.
	      int n = 125;     //  0x7D
	      
	      int remider, share;   
	      
	      // String strHex = "";
	      StringBuilder sb = new StringBuilder();
	      
	      String hex = "0123456789ABCDEF";
	      while ( n != 0 ) {   
	         share = n / 16;
	         remider = n % 16;
	         // System.out.println(remider);
	         sb.append(hex.charAt(remider));
	         //sb.insert(0, hex)
	          
	         n = share;
	      } // while
	      
	      System.out.println( sb.reverse()  );*/


	} // main

} // class
