package days07;

import java.util.Arrays;
import java.util.Random;

/**
 * @author lsh
 * @date 2024. 7. 9. - 오후 12:07:48
 * @subject 제어문 + 배열 활용
 * @content
 *
 */
public class Ex03 {

	public static void main(String[] args) {

		// 신용카드
		String card = "7655-8988-9234-5677";
		String regex = "-";
		String [] cardArr = card.split(regex);

		/*
	      for (String c : cardArr) {
	         System.out.println(c);
	      }
		 */
		System.out.println( Arrays.toString(cardArr) );

		// 0~3 임의의 정수
		Random rnd = new Random();
		int index = rnd.nextInt(4);  // 0<=  정수  < 4
		cardArr[index] = "*".repeat(4);

		System.out.println( Arrays.toString(cardArr) );

		/*
	       System.out.printf("%s-%s-%s-%s\n"
	             , cardArr[0], cardArr[1]
	             , cardArr[2], cardArr[3]);
		 */
		String printCard = String.join("-", cardArr);
		System.out.println( printCard );


		// 카드 결재 영수증
		/*
	      7655-****-9234-5677
	      7655-8988-9234-****
		 ****-8988-9234-5677
	      7655-8988-****-5677
		 */



	} // main

} // class
