package days17;

import java.util.Arrays;

/**
 * @author lsh
 * 	@date 2024. 7. 23. - 오전 11:43:55
 * @subject
 *	@content
 * 
 */
public class Ex02 {

	public static void main(String[] args) {

		// 7. https://school.programmers.co.kr/learn/courses/30/lessons/120913 위의 주소 문제 풀기.
		String [] answer = solution("abc1Addfggg4556b", 6);
		System.out.println(Arrays.toString(answer));

		answer = solution("abcdef123", 3);
		System.out.println(Arrays.toString(answer));

	} // main

	public static String[] solution(String my_str, int n) {
		int length = (int) Math.ceil( (double) my_str.length()/n );
		String[] answer = new String[length];
		
		// 참고
		
		/* 1. 풀이
		int beginIndex = 0, endIndex = n;
		int my_strLength = my_str.length();
		// answer[0] = my_str.substring(0, n);
		// answer[1] = my_str.substring(i*n, (i+1)*n);
		// answer[2] = my_str.substring(12,18);
		for (int i = 0; i < length; i++) {
			beginIndex = i*n;
			endIndex = (i+1)*n;
			if (endIndex > my_str.length()) endIndex = my_strLength;
			answer[i] = my_str.substring(beginIndex, endIndex);
		}
		*/
		
		return answer;
	}


} // class
