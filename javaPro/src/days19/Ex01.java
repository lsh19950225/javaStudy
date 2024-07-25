package days19;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) { // 참고

		// solution("abc1Ad", 6);
		solution("abc1Addfggg4556b", 6);

	} // main

	public static String [] solution(String my_str, int n) {
		ArrayList list = new ArrayList();

		int i = 0;
		String str = null;
		try {
			while(true) {
				str = my_str.substring(i*n, (i+1)*n);
				//System.out.println(i + " : " + str);
				list.add(str);
				i++;
			} // while
		} catch (StringIndexOutOfBoundsException e) {
			str = my_str.substring(i*n);
			if(str.length() != 0) {
				//System.out.println(i + " : " + str);
				list.add(str);
			}
		}

		// 1. ArrayList -> String [] 변환
		// 2. String [] -> ArrayList 변환(검색)
		String [] answer = (String[]) list.toArray();
		
		System.out.println(Arrays.toString(new String[list.size()]));
		
		return answer;

	}

} // class
