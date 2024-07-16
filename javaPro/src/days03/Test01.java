package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author lsh
 * @date 2024. 7. 3. - 오후 9:50:24
 * @subject
 * @content
 *
 */
public class Test01 {

	public static void main(String[] args) throws IOException {

		/*// 복습
		//return;
		//System.out.println("이시훈");

		/*String name;
		name = "이시훈";
		System.out.println(name);
		String name;*/

		//String name;
		//System.out.println(name);

		//final double PI;*/
		
		
		// 실수형 :  float, [double]
		//            3.14F   3.14D
		
		// char
		// 2바이트 [][]
		// int
		// 2바이트 [s][]
		// 4바이트 [s][][][]
		// float
		//            1  [E]xponent 지수
		//                     [M]antissa 가수
		// 4바이트 [s][E8][M23]
		// double
		// 8바이트 [1][E11][M52]
		// +-M x 10^E
		
		// 9.1234567 실수
		// 1001.000111111001101011011011.....(무한실수) : 정규화
		// 1.001000111111001101011011011..... x 2^3(무한실수)


		/*// 이름을 표준입력장치(키보드)로 부터 입력받아서 출력
		// 키보드 -> System.in -> 문자변환 -> 문자열 변환
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("> 이름 입력 ? ");
		String name = bufferedReader.readLine(); // String
		System.out.println(name);*/

		/*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String name;
		byte age = 20;

		System.out.print("> 이름 입력 ? ");
		name = bufferedReader.readLine();

		System.out.print("> 나이 입력 ? ");
		// 오류 Type mismatch: cannot convert from String to byte
		// age = bufferedReader.readLine();
		
		// 타입(형) 변환
		// String -> byte : B.parse~, int : I.parse~
		
		age = Byte.parseByte(bufferedReader.readLine());
		
		// 오류 java.lang.NumberFormatException : 나이 잘못 입력
		System.out.printf("이름=\"%s\", 나이=%d", name, age);*/
		

		/*int i = 10;

		System.out.println(Integer.toBinaryString(i)); // 2진수
		System.out.println(Integer.toOctalString(i)); // 8진수
		System.out.println(Integer.toHexString(i)); // 16진수

		// d-10진수, o-8진수, x-16진수
		System.out.printf("%d\n",i);
		System.out.printf("%o\n",i);
		System.out.printf("%x\n",i);
		System.out.printf("%X\n",i);

		int money = 23535790;
		System.out.printf("%,d\n",money);*/

		/*int i = Integer.MAX_VALUE;
		int j = 100;

		long k = (long)i + j;
		System.out.printf("%d + %d = %d\n",i,j,k);*/


		/*String 이시훈
		byte 국어, 영어, 수학
		short 총점, double 평균 계산
		[출력형식] 홍길동 90 89 91 270 90.00
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String name;
		byte kor, eng, mat;
		short tot;
		double avg;
		System.out.print("> 이름 입력 ? ");
		name = bufferedReader.readLine();
		System.out.print("> 국어 입력 ? ");
		kor = Byte.parseByte(bufferedReader.readLine());
		System.out.print("> 영어 입력 ? ");
		eng = Byte.parseByte(bufferedReader.readLine());
		System.out.print("> 수학 입력 ? ");
		mat = Byte.parseByte(bufferedReader.readLine());

		tot = (short)(kor + eng + mat);
		avg = (double)tot/3;

		System.out.printf("%s\t%d\t%d\t%d\t%d\t%f\n",name,kor,eng,mat,tot,avg);
		\t  : 탭만큼 띄어쓰기(4칸정도 소모)*/


		/*int no = 15;
		System.out.printf("%d\n",no);
		System.out.printf("%05d\n",no); // 00015
		System.out.printf("-".repeat(20)); // --------
		System.out.println(); // 개행

		int i = 100; // 자동 형변환 : 작은자료형 -> 큰자료형 1번째 경우
		long I = i;

		long k = I + i; // 자동 형변환 : 큰자료형 + 작은자료형 -> 큰자료형 2번째 경우
		
		// 강제 형변환 : (변환하고자하는 타입) cast 연산자
		// cast 강제 형변환
		i = (int) 100L
		// () : 최우선 연산자
		// (3 + 5) * 2 == 16*/
		

		/*String name;
		byte kor, eng, mat;
		short tot;
		double avg;
		
		// [S]canner : 클래스

		Scanner scanner = new Scanner(System.in);
		// 이시훈 98 87 77
		System.out.printf("> 이름, 국어, 영어, 수학 입력 ? ");
		name = scanner.next();
		kor = scanner.nextByte();
		eng = scanner.nextByte();
		mat = scanner.nextByte();

		tot = (short)(kor + eng + mat);
		avg = (double)tot/3;

		System.out.printf("%s\t%d\t%d\t%d\t%d\t%f\n",name,kor,eng,mat,tot,avg);*/
		
		
		/*ctrl + a
		ctrl + i
		file - refactor - rename : 이름 바꾸기
		search -> quick search : 검색
		regular expressions : 정규 표현식
		io == in out put == 입출력
		\s == space, \\ == \, * : 상관x
		ctrl + shift + o : import*/
		
		
		// 연산자(operator)
		// String -> int  Integer.parseInt("20");
		// int -> String 20 + ""
		/* 1. 연산자 정의
		 * 		: 연산을 수행하는 기호 + - 등
		 * 2. 피연산자(operand)
		 * 		: 연산자의 작업 대상 [3] + [5]
		 * 3. 피연산자 갯수에 따라
		 * 		1) 단항연산자
		 * 		2) 이항연산자 : +
		 * 		3) 삼항연산자
		 * 3-2. 기능에 따라
		 * 		1) 산술연산자
		 * 		2) 비교연산자
		 * 		3) 논리연산자
		 * 		4) 대입연산자
		 * 		등
		 * 4. 식(expression)
		 * 		: 연산자와 피연산자를 조합하여 표현한 것 */
		
		// 산술 연산자 : + - * /, % : 나머지 연산자
		// 1. 정수 / 0
		// 오류 java.lang.ArithmeticException : 산술적 예외가 발생 by zero
		// System.out.println(10/0);
		
		// 2. 실수 / 0 Infinity
		System.out.println(10.0/0); // Infinity
		System.out.println(Double.isInfinite(10.0/0)); // true
		
		// 실수 % 0 NaN 리터럴
		System.out.println(10.0%0); // NaN
		System.out.println(Double.isNaN(10.0%0)); // true
		
		int i = 10, j = 3; // 나머지 연산자
		System.out.println(i % j);
		System.out.println((double)i/j);
		
		// 비교 연산자 : 크다, 작다, 같거나크다 등
		//					비교연산의 결과는 boolean 참 거짓
		System.out.println(i==j);
		System.out.println(i!=j);
		// 오류 The operator ! is undefined for the argument type(s) int
		// 부정해서 대입함
		// System.out.println(i=!j);
		
		// 논리 연산자 참/거짓
		/* 1. 일반 논리 연산자
		 * ㄱ. &&	일반논리 AND 연산자(논리곱)
		 * 두 피연산자가 모두 참일 때만 참
		 * 참 참 : 참
		 * 참 거짓 : 거짓
		 * 거짓 참 : 거짓
		 * 거짓 거짓 : 거짓
		 * 
		 * ㄴ. || : enter 위	일반논리 OR 연산자
		 * 참 참 : 참
		 * 참 거짓 : 참
		 * 거짓 참 : 참
		 * 거짓 : 둘다 거짓이면 거짓
		 * 
		 * ㄷ. !	부정(NOT) 연산자
		 * !참 : 거짓
		 * !거짓 : 참
		 * 
		 * 2. 비트 논리 연산자
		 * ㄱ. & 비트논리 AND 연산자
		 * ㄴ. | 비트논리 OR 연산자
		 * ㄷ. ^ XOR 연산자 == e[X]clusive 배타적인
		 * ㄹ. ~ 틸드 연산자(비트부정 연산자)
		 */
		
		 // 오류 Dead code : 죽은 코딩
		 // System.out.println(3>5 && 100>1);
		
		/*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		Byte age;
		
		System.out.print("> 이름 입력 ? ");
		name = bufferedReader.readLine();
		System.out.print("> 나이 입력 ? ");
		age = Byte.parseByte(bufferedReader.readLine());
		
		System.out.printf("이름=\"%s\", 나이=%d", name, age);*/
		
		/*Scanner scanner = new Scanner(System.in);
		
		String name;
		Byte age;
		
		System.out.print("> 이름 입력 ? ");
		name = scanner.next();
		System.out.print("> 나이 입력 ? ");
		age = scanner.nextByte();
		
		System.out.printf("이름=\"%s\", 나이=%d", name, age);*/
		
		/*String name;
		byte kor, eng, mat;
		short tot;
		double avg;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 이름, 국어, 영어, 수학 입력 ? ");
		name = scanner.next();
		kor = scanner.nextByte();
	    eng = scanner.nextByte();
		mat = scanner.nextByte();
		tot = (short) (kor + eng + mat);
		avg = (double) tot/3;
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%f\n", name, kor, eng, mat, tot, avg);*/
		
		/*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String name;
		byte age;
		
		System.out.print("이름=");
		name = bufferedReader.readLine();
		
		System.out.print("나이=");
		age = Byte.parseByte(bufferedReader.readLine());
		
		System.out.printf("이름=\"%s\" 나이=%d", name, age);*/
		
		
		// Integer.parseInt("20")
		
		

		
	
		
		







	}

}
