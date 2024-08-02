package days23;

public class Ex11 {

	public static void main(String[] args) {
		
		// 최종 연산의 결과 타입이 Optional 인 경우가 있다.
		// Optional<T> 'T타입의 객체' 래퍼클래스이당.
		// 모든 타입의 참조변수를 저장할 수 있는 객체이당.
		
		// Optional 객체 생성
		// 1) of()					of(null) 예외발생
		// 2) ofNullable()						x
		
		// 2. Optional 객체로 부터 값을 얻어오는 방법
		// 1) get()					null인 경우 예외발생.
		// 2) orElse()			null -> "" 빈문자열 리턴
		// 		orElseGet()		null -> "" 빈문자열이 아니라 다른 값을 반환.
		
		// 3. isPresent		Optional 객체의 값이 null 이면 flase 아니면 true
		
		// Optional<T>		get()
		// OptionalInt, OptionalLong, OptionalDouble ..
		// getAsInt()		getAsLong()		getAsDouble()
		
	} // main

} // class
