package days23;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex09 {

	public static void main(String[] args) {

		// Arrays.stream(null)
		Stream<Student> s = Stream.of( // 스트림 객체 생성
				new Student("이자바", 3, 300),
				new Student("김자바", 1, 200),
				new Student("안자바", 2, 100),
				new Student("박자바", 2, 150),
				new Student("소자바", 1, 200),
				new Student("나자바", 3, 290),
				new Student("감자바", 3, 180)
				);
		// String<Integer> is
		IntStream is = s.mapToInt(Student::getTotalScore);
		
		// 요약	통계량
		IntSummaryStatistics stat = is.summaryStatistics();
		System.out.println("count = " + stat.getCount()); // 학생 수
		System.out.println("count = " + stat.getSum()); // 총점 합
		System.out.println("count = " + stat.getAverage()); // 총 평균
		System.out.println(stat.getMax());
		System.out.println(stat.getMin());
		
		// s.sorted(Comparator.comparing(Student::getBan).thenComparing(Comparator.naturalOrder()))
		// .forEach(System.out::println); // 2차 권정열		최종연산
		
		//
		
		

	} // main

} // class
