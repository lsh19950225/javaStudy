package days23;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author lsh
 * 	@date 2024. 7. 31. - 오전 9:02:29
 * @subject
 *	@content
 * 
 */
public class Ex01 {

	public static void main(String[] args) { // 참고

		/*
		 * [람다식(Lambda Expression)]
		 * 1) jdk 1.8 추가
		 * 2) 자바 = 객체 지향 프로그래밍 언어 + 함수형 언어(장점)
		 * 3) 정의 ? 메서드를 하나의 식으로 표현한 것.
		 * 			-> 화살표 연산자
		 * 4) 메서드 -> 람다식 표현
		 * 		ㄱ. 메서드이름 x
		 * 		ㄴ. 반환값 x
		 * 		람다식을 '익명 함수(anonymous function)' 이라고도 한다.
		 * 5) 모든 메서드 선언 -> 호출
		 * 		- 반드시 클래스를 선언한 후 멤버 함수
		 * 		- 객체를 생성		객체명.메서드명() 호출
		 * 
		 * 		=> 하지만 람다식은 이 모든 과정없이 오직
		 * 			람다식 자체만으로 이 메서드의 역할을 대신할 수 있다.
		 * 6) 람다식은 메서드의 매개변수로 전달되어진 것이 가능.
		 * 					"		" 리턴값으로 반환 가능
		 * 
		 * 7) 함수 / 메서드 차이점.
		 * 		- 메서드 : 클래스 안에 선언된 멤버 함수
		 * 					객체의 동작, 기능
		 * 		- 함수 : 하나의 독립적인 기능.
		 * 
		 * 
		 * 2. 람다식 형식
		 * 		리턴자료형 메서드명(매개변수...)->{
		 * 			명령코딩;
		 * 			명령코딩;
		 * 			명령코딩;
		 * 			return 반환값;
		 * 		}
		 * 
		 * 2-2. 메서드 -> 람다식 선언 방법.
		 * int max(int a, int b){
		 * 		return a>b? a: b;
		 * }
		 * =>
		 * (int a, int b)->{return a>b? a: b;}
		 * => 반환값이 있는 경우 "return 리턴값" 형식이 아닌
		 * 		식으로 대신할 수 있다.
		 * (주의) 세미콜론(;)을 생략한다.
		 * (int a, int b) -> a>b? a: b
		 * => 람다식에 선언된 매개변수의 타입이 추론 가능할 경우 생략 가능하다.
		 * 		(대부분 추론이 가능하기에 생략한다.)
		 * => (a, b) -> a>b? a: b
		 * => (a, int b) -> a>b? a: b 불가능.
		 * = 매개변수가 1개 인 경우에만 괄호()를 생략 가능.
		 * 		int test(int a){
		 * 			return a*2;
		 * 		}
		 * 		a -> a*2
		 * 		(a) : 매개변수 없을 경우.
		 * 		int a X
		 * 
		 * (String name, int i) -> {System.out.println(name+"/"+i);
		 * => 괄호{} 안에 명령문장 1개 일 경우 {} 생략 가능
		 * 			명령문장 뒤에 ;을 붙이지 않는다.
		 * 		(name, i) -> System.out.println(name+"/"+i)
		 * 
		 * - 괄호{} 생략할 때 주의할점
		 * 		: 괄호{} 안에 명령문장 1개일지라도 return 문 일 경우에는 괄호{}를 생략할 수 없다.
		 * 		(String name, int i) -> {return name+"/"+i};
		 * 
		 * 3. 함수형 인터페이스(Functional Interface)
		 * 		1) 함수형 인터페이스 - 람다식을 다루기 위한 인터페이스.
		 * 		2) 함수형 인터페이스는 오직 하나의 추상 메서드만을 가진다.(제약)
		 * 			1 람다식			인터페이스 1메서드
		 * 				1			:		1 연결된다.
		 * 				int a = 10;
		 * 				FI	f = ()-> 2;
		 * 		3) 메서드 -> 식 = 람다식
		 * 			모든 메서드는 클래스의 멤버로 선언되어져야 한다.
		 * 			그러면 람다식도 어떤 클래스의 멤버로 선언되어져야 한다. ? 익명 클래스(객체)
		 * 		4) static, default 메서드는 갯수 제약이 없다.
		 * 		5) @FunctionalInterface 어노테이션을 붙이면
		 * 			컴파일러가 함수형 인터페이스로 인식을해서 올바르게
		 * 			정의되었는지 체크..
		 * 3-2. 예
		 * 		함수형 인터페이스
		 * 		@FunctionalInterface
		 * 		interface MyFunction{
		 * 			int max(int a, int b);
		 * 		}
		 * 
		 * 		MyFunction myfunc = new MyFunction(){
		 * 			@Override
		 * 			int max(int a,int b){
		 * 				return a>b?a:b;
		 * 			}
		 * 		}
		 * 		
		 * 		int max = myfunc.max(1,2);
		 * 
		 * 		MyFunction myfunc = (a,b)-> a>b?a:b;
		 * 
		 *		// 익명 클래스 = 클래스 선언 + 생성
		 *		// 익명 객체
		 * 		new 부모인터페이스(){
		 * 			오버라이딩
		 * 			max
		 * 		}
		 * 
		 * 		ㄴ 이처럼 MyFunction 인터페이스를 구현한
		 * 		익명클래스(객체)를 람다식으로 대체 가능한 이유 ?
		 * 		내부적으로 람다식도 실제로 익명 객체이기 때문이다. (이해)
		 * 		ㄴ 자바의 규칙으로 하나의 추상메서드가 선언된 인터페이스를 정의해서
		 * 			람다식으로 다루자..
		 * 		=> 람다식을 다루기 위한 인터페이스를 "함수형 인터페이스"라고 부르기로 했다.
		 * 
		 * 3-3. 함수형 인터페이스 타입의 매개변수와 반환타입 설명 예제
		 * @FunctionalInterface
		 * interface MyFunction{
		 * void test();
		 * }
		 * 
		 * MyFunction myfunc = ()-> System.out.println("test");
		 * 
		 * ㄴ
		 * class X{
		 * 		void disp(MyFunction f){
		 * 			f.test();
		 * 		}
		 * }
		 * 
		 * obj.disp(()-> System.out.println("test"));
		 * 
		 * 
		 * ㄴ 함수형 인터페이스(람다식) 타입의 리턴자료형..
		 * class Y{
		 * 		// disp2() 메서드의 리턴자료형이 함수형 인터페이스 타입
		 * 		MyFunction disp2(){
		 * 				MyFunction f = ()->{};
		 * 				return f;
		 * 				== return ()->{};
		 * 			}
		 * }
		 * 
		 * 3-4. 람다식의 타입과 형변환.
		 * @FunctionalInterface
		 * interface MyFunction{
		 * 		void myMethod();
		 * }
		 * 함수형 인터페이스로 람다식을 참조는 할 수 있을 뿐이지
		 * 람다식의 타입과 함수형 인터페이스의 타입은 일치하지 않는다.
		 * 그래서 타입에 맞게 형변환은 해줘야 된다. (필요)
		 * MyFunction f = ()->{};
		 * MyFunction f = (MyFunction) (()->{});
		 * 
		 * 3-5. 외부 변수를 참조하는 람다식.
		 * 
		 * 4. [java.util.function 패키지]
		 * 		1) 제네릭 메서드		T
		 * 		2) 대부분의 메서드는 비슷하다.
		 * 			? 매개변수 갯수0,1,2, 리턴값0,1
		 * 		3) 자주 사용되는 형식의 메서드를 함수형 인터페이스로 정의해서
		 * 			java.util.function 패키지에 정의.
		 * 		4) 이유 ?
		 * 			매번 새로운 함수형 인터페이스를 개발자가 정의하지 말고
		 * 			가능하면 이 패키지의 함수형 인터페이스를 활용하라는
		 * 			의미가 포함.
		 * 			(표준화, 재사용, 유지보수 용이)
		 * 
		 * 		5) java.util.function 패키지의 주요 함수형 인터페이스
		 *    		1) java.lang.Runnable      void run()              매 0, 리 0
		 *     		2) Supplier<T>                T get()                   매 0, 리 1
		 *     		3) Consumer<T>             void accept(T t)     매 1, 리 0
		 *     		4) Function<T,R>             R apply(T t)           매 1, 리 1
		 *    		5) Predicate<T>              boolean test(T t)    매 1, 리턴타입 boolean
		 *    
		 *    6) 매개변수가 두 개인 함수형 인터페이스		"Bi" 접두사
		 *    		1) BiConsumer<T,U>       void accept(T t, U u)
         *   		2) BiPredicate<T,U>        boolean test(T t, U u)
         *    		3) BiFunction<T,U,R>      R apply(T t, U u)
		 */

		List<String> list = Arrays.asList("abc", "aaa", "bbb", "ddd", "aaa");
		Collections.sort(list); // 오름차순 정렬

		/*Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				return o2.compareTo(o1);
			}
		});*/

		Collections.sort(list, (o1,o2)->o2.compareTo(o1));

	} // main

} // class

@FunctionalInterface
interface MyFunction {
	void myMethod();
}

class Outer {

	int val = 10; // Outer.this.val

	class Innter {
		int val = 20; // this.val
		void method(int i) {
			int val = 30; // final int val = 30;	상수
			MyFunction f = ()->{
				System.out.println(i); // method(int i)
				System.out.println(val); // int  val = 30;
				System.out.println(this.val); // int val = 20;

				System.out.println(Outer.this.val); // int val = 10;
			};

			f.myMethod(); // 호출
		}
	}
}


