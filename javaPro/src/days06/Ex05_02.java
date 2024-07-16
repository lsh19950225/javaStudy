package days06;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author lsh
 * @date 2024. 7. 8. - 오후 2:34:12
 * @subject
 * @content
 *
 */
public class Ex05_02 {

	public static void main(String[] args) {
		// *소개
		// [람다식과 스트림]
		// 1~100 까지의 임의의 정수         10개 배열 m
		// 합
		// 갯수
		// 평균
		// 최대값
		// 최소값

		/*IntStream istream = new Random().ints(1, 101).limit(10);
		long count = istream.count();
		int sum = istream.sum();
		OptionalDouble odAvg = istream.average();
		double avg = odAvg.getAsDouble();
		OptionalInt oiMax = istream.max();
		int max = oiMax.getAsInt();*/


		// IntStream.of(int...args)
		// IntStream.of(3,4,2,1,5).max().ifPresent(System.out::println);
		
		int [] m = new int[10];

		for (int i = 0; i < m.length; i++) {
			m[i] = (int)( Math.random()*100 )+1;
		}
		System.out.println(Arrays.toString(m));
		// 2.
		//  int[] -> IntStream
		int [] n = IntStream.of(m).filter(i-> i>75).toArray();
		System.out.println(Arrays.toString(n));
















	} // main

} // class
