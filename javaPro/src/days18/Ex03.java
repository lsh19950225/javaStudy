package days18;

/**
 * @author lsh
 * 	@date 2024. 7. 24. - 오전 11:50:41
 * @subject
 *	@content
 * 
 */
public class Ex03 {

	public static void main(String[] args) {
		
		/*
		 * jdk 1.0 java.util.Date
		 * jdk 1.1 java.util.Calendar
		 * 
		 * SDF, DF, CF, MF 형식화 클래스
		 * 
		 * [jdk 1.8 새로 추가된 날짜, 시간 클래스]
		 * java.time
		 * 		ㄴ j.t.chrono: 표준이(ISO) 아닌 달력 시스템을 위한 클래스 제공
		 * 		ㄴ j.t.format: 형식화(파싱) 클래스 제공
		 * 		ㄴ j.t.temporal(시간의): 날짜, 시간의 필드와 단위 클래스 제공
		 * 		ㄴ j.t.zone: 시간대(time-zone) 클래스 제공
		 * 
		 * 2. java.time : 날짜, 시간을 다루는 핵심 클래스
		 * 		1) 날짜 : LocalDate
		 * 		2) 시간 : LocalTime
		 * 		3) 날짜+시간 : LocalDateTime
		 * 		4) 날짜+시간+시간대 : ZonedDateTime
		 * 		-> Temporal, TemporalAdjuster 인터페이스를 구현
		 * 
		 * 3. Period		= 날짜와 날짜 사이의 간격
		 * 		Duration	= 시간과 시간 사이의 간격
		 * 		-> TemporalAmount 인터페이스 구현
		 * 
		 * 4. j.t 핵심클래스		new 객체 생성 x
		 * 		: of(), now()		Ex03_02.java
		 * 
		 * 5. 날짜+시간의 단위를 정의해 놓은 인터페이스 : TemporalUnit
		 * 		위의 인터페이스를 구현한 클래스 			: ChronoUnit
		 * 
		 * 6. 날짜+시간의 필드를 정의해 놓은 인터페이스 : TemporalField
		 * 											클래스 		: ChronoField
		 * 
		 * 7. 특정 필드(년,월,시,분 등등) 얻어올 때
		 * 		get(년도), getYear()
		 * 		get(월), getMonth()
		 * 					getXXX()
		 * 
		 * 8. 특정 필드(년,월,시,분 등등)를 수정
		 * 		with()
		 * 		plus()
		 * 		minus()
		 * 		roll() / add()
		 */

	} // main

} // class










