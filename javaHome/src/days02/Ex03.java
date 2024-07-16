package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String name;
		byte kor, eng, mat;
		short add;
		double aaa;
		
		System.out.print("이름 ? ");
		name = bufferedReader.readLine();
		
		System.out.print("국어 점수 ? ");
		kor = Byte.parseByte(bufferedReader.readLine());
		System.out.print("영어 점수 ? ");
		eng = Byte.parseByte(bufferedReader.readLine());
		System.out.print("수학 점수 ? ");
		mat = Byte.parseByte(bufferedReader.readLine());
		
		add = (short) (kor + eng + mat);
		aaa = (double) add/3;
		
		System.out.printf("이름:\"%s\", 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%f\n", name, kor, eng, mat, add, aaa);
		
		
		
		

	}

}
