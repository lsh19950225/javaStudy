package days10;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author lsh
 * @date 2024. 7. 12. - 오후 4:41:35
 * @subject
 * @content
 *
 */
public class Ex_05 {

	public static void main(String[] args) { // 강사님 참고

		int [] m = { 8, 3, 3, 0, 1, 7, 0, 1, 1, 4, 2, 0, 1, 7, 1, 9, 3, 9, 5, 0, 5, 0, 0, 9, 1, 4, 7, 8, 3, 2, 1, 7, 1, 1, 7, 3, 8, 3, 4, 0, 4, 3, 2, 3, 6, 1, 3, 1, 8, 8, 0, 4, 1, 8, 9, 9, 2, 2, 2, 5, 2, 7, 6, 1, 2, 0, 6, 6, 2, 6, 4, 9, 7, 8, 0, 6, 7, 6, 6, 0, 7, 3, 9, 2, 5, 6, 7, 8, 7, 7, 7, 5, 1, 3, 2, 7, 9, 8, 0, 4};
		/*
		System.out.println(m.length);
		int max = m[0];
		int min = m[0];
		// int max = IntStream.of(m).max().getAsInt();
		
		for (int i = 0; i < m.length; i++) {
			max = Math.max(max, m[i]);
			min = Math.min(min, m[i]);
		}
			System.out.printf("max=%d, min=%d\n",max,min);
		*/
		
		// [출력결과]
		// 0 - 5개
		// 1 - 16개
		// :
		// 9 - 22개
		/*
		int cnt0, cnt1, cnt2, cnt3, cnt4, cnt5, cnt6, cnt7, cnt8, cnt9;
		cnt0=cnt1=cnt2=cnt3=cnt4=cnt5=cnt6=cnt7=cnt8=cnt9=0;
		for (int i = 0; i < m.length; i++) {
			switch (m[i]) {
			case 0: 			break;
			case 1: 			break;
			case 2: 			break;
			case 3: 			break;
			case 4: 			break;
			case 5: 			break;
			case 6: 			break;
			case 7: 			break;
			case 8: 			break;
			case 9: 			break;
			default:
				break;
			}
			
		}
		*/
		
	} // main

} // class
