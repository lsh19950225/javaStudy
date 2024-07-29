package days21;

import java.util.Scanner;

import lombok.Getter;

/**
 * @author lsh
 * 	@date 2024. 7. 29. - 오전 9:15:35
 * @subject
 *	@content
 * 
 */
@Getter	// (다른 프로그램)컴파일러 (미리 약속된 형식)getter 메서드 자동으로 추가..
// 롬복이 제공하는 어노테이션
public class Ex02 {
	
	// @Override // 표준 어노테이션.
	// 컴파일러에게 오버라이딩 한 메서드이다.. 알려주는 것.
	
	public static void main(String[] args) {
		
		/*
		 * [애노테이션(Annotation)]
		 * 1. 사전적 의미 : 주석
		 * 2. *정의 : 프로그램의 소스 코드 안에
		 * 				다른 프로그램을 위해서
		 * 				미리 약속된 형식을
		 * 				포함시키는 것.
		 * 3. jdk에서 기본적으로 제공하는 어노테이션 : 표준 어노테이션.
		 * 4. 표준 어노테이션 종류
		 * 		1) @Override
		 * 		2) @Deprecated : 생성자, 필드, 메서드가 앞으로 없어질 예정..
		 * 		3) @SuppressWarnings : 컴파일러의 특정 경고 메세지가 나타나지 않게하는 것.
		 * 		4) @FunctionInterface : 함수형 인터페이스
		 * 		5) @SafeVarargs : 제네릭 타입의 가변인자에 사용되는 어노테이션
		 * 		6) @Native : C언어 메서드 -> 자바 코딩 사용.
		 * 
		 * 		또 다른 어노테이션에 사용되는 어노테이션 : 메타 어노테이션
		 * 		@Target, @Documented, @Inheriten, @Retention, @Repeatable
		 */
		
		// The value of the local variable scanner is not used
		@SuppressWarnings({ "unused", "resource" })
		Scanner scanner = new Scanner(System.in);

	}

}