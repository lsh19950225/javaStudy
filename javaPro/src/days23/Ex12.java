package days23;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex12 {

	public static void main(String[] args) {

		String[] strArr = {
				"Inheritance", "Java", "Lambda", "stream",
				"OptionalDouble", "IntStream", "count", "sum"
		};

		IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
		int count = intStream1.reduce(0, (a,b)-> a+1);
		System.out.println(count); // 요소의 수
		
		IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
		int sum = intStream2.reduce(0, (a,b)-> a+b);
		
		System.out.println(sum); // 요소의 합
		IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
		
		IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);
		
		
		
		// Array->Stream 변환(생성)
		// Stream.of(strArr).forEach(System.out::println);

		// boolean result = Stream.of(strArr).noneMatch(s-> s.length()==0);
		// System.out.println(result);

		// Optional<String> o1 = Stream.of(strArr).filter(s-> s.charAt(0) == 's')
		// .findFirst();
		// System.out.println(o1.get());

		// reduce()

	} // main

} // class
