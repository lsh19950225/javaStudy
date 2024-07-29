package days21;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ex07_02 {

	public static void main(String[] args) throws IOException {

		// 3) 문자 스트림 o
		// StringReader/StringWriter

		String content = "package days21;\r\n"
				+ "\r\n"
				+ "import java.util.Iterator;\r\n"
				+ "\r\n"
				+ "/**\r\n"
				+ " * @author lsh\r\n"
				+ " * 	@date 2024. 7. 29. - 오전 8:53:46\r\n"
				+ " * @subject\r\n"
				+ " *	@content\r\n"
				+ " * \r\n"
				+ " */\r\n"
				+ "public class Ex01 { // 참고\r\n"
				+ "\r\n"
				+ "	/* enum Direction {\r\n"
				+ "		EAST, SOUTH, WEST, NORTH\r\n"
				+ "	}*/\r\n"
				+ "\r\n"
				+ "	enum Direction {\r\n"
				+ "		EAST(100, \"▶\"), SOUTH(200, \"▼\"), WEST(300, \"◀\"), NORTH(400,\"▲\") ;\r\n"
				+ "\r\n"
				+ "		private int value;\r\n"
				+ "		private String symbol;\r\n"
				+ "\r\n"
				+ "		Direction(int value, String symbol) {\r\n"
				+ "			this.value = value;\r\n"
				+ "			this.symbol = symbol;\r\n"
				+ "		}\r\n"
				+ "\r\n"
				+ "		public int getValue() {\r\n"
				+ "			return this.value;\r\n"
				+ "		}\r\n"
				+ "\r\n"
				+ "		public String getSymbol() {\r\n"
				+ "			return this.symbol;\r\n"
				+ "		}\r\n"
				+ "\r\n"
				+ "	}\r\n"
				+ "\r\n"
				+ "	/*\r\n"
				+ "	 * 컴파일러가 클래스 변환\r\n"
				+ "	 * class Direction extends Enum {\r\n"
				+ "	 * 		static final Direction EAST = new direction();\r\n"
				+ "	 * 		private String name;\r\n"
				+ "	 * 		밑과 똑같음.\r\n"
				+ "	 * \r\n"
				+ "	 * \r\n"
				+ "	 * 		private int ordinal;\r\n"
				+ "	 * 		public int ordinal() {\r\n"
				+ "	 * 		return this.ordinal;\r\n"
				+ "	 * 		}\r\n"
				+ "	 * }\r\n"
				+ "	 * \r\n"
				+ "	 */\r\n"
				+ "\r\n"
				+ "	public static void main(String[] args) {\r\n"
				+ "\r\n"
				+ "		//		System.out.println(Direction.EAST); // 디렉션으로 선언된 객체. , \"EAST\"\r\n"
				+ "		//		System.out.println(Direction.EAST.toString()); // \"EAST\"\r\n"
				+ "		//		System.out.println(Direction.EAST.name()); // \"EAST\"\r\n"
				+ "		//		System.out.println(Direction.EAST.ordinal()); // 0 index : 0번째라\r\n"
				+ "\r\n"
				+ "		Direction [] dirArr = Direction.values();\r\n"
				+ "		for (Direction dir : dirArr) {\r\n"
				+ "			System.out.println(\r\n"
				+ "					dir.name() + \"/\"\r\n"
				+ "							+ dir.ordinal() + \"/\"\r\n"
				+ "							+ dir.getSymbol() + \"/\"\r\n"
				+ "							+ dir.getValue());\r\n"
				+ "		}\r\n"
				+ "\r\n"
				+ "	} // main\r\n"
				+ "\r\n"
				+ "} // class\r\n"
				+ "";
		// [문제] Ex01.java 파일의 21번째 라인의 문자열
		// String line21 변수에 저장한 후 출력..

		/*1번 풀이
		String [] datas = content.split("\r\n");
		String line21 = datas[20];
		System.out.println(line21);*/

		// 2번 풀이
		// 메모리 스트림 StringReader, StringWriter
//		StringReader reader = new StringReader(content);
//		BufferedReader br = new BufferedReader(reader);
//		for (int i = 0; i < 20; i++) br.readLine();		
//		String line21 = br.readLine();
//		System.out.println(line21);



		// 3번 풀이
		// String [] -> Stream<String> -> 20 라인 스킵 -> 21..
		// Optional<String> -> String
		String line21 = Stream.of((content).split("\r\n")).skip(20).findFirst().get();
		System.out.println(line21);
	} // main

} // class
