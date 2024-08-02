package days23;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex10 {

	public static void main(String[] args) {

		Stream<String[]> strArrStrm = Stream.of(
				new String[]{"abc", "def", "jkl"}, 
				new String[]{"ABC", "GHI", "JKL"}
				);
		// new String[]{} 요소 -> Stream<Stream<String>>
		// Stream<Stream<String>> s2 = strArrStrm.map(Arrays::stream);
		
		Stream<String> s2 = strArrStrm.flatMap(Arrays::stream);
		s2.map(String::toLowerCase).distinct().sorted().forEach(System.out::println);
		
	} // main

} // class
