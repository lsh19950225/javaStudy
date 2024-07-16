package days02;

public class Ex02 {

	public static void main(String[] args) {
		
	   
	    
		// 본인 이름을 저장할 [변수 선언 형식]
		// 타입(자료형) 변수명 [= 초기값];
		// 자바 식별자
		
		// Type mismatch: cannot convert from int to String
		// The value of the [local variable:지역변수] name is not used
		/*String name = "이시훈";   // = 대입연산자
		System.out.println(name);
		
		// Duplicate local variable name
		String name = "이창익";   // = 대입연산자
		System.out.println(name);*/
       
		String name ;   // = 대입연산자
		name = "이시훈";
		// The local variable name may not have been initialized
		// 지역변수는 반드시 초기화해야지 사용할 수 있다.
		System.out.println(name);
		
		name = "이창익";   // = 대입연산자
		System.out.println(name);
       // [변수와 상수]

	}

}
