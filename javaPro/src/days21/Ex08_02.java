package days21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.MessageFormat;

public class Ex08_02 {

	public static void main(String[] args) {

		String fileName = ".\\src\\days21\\student.txt";

		try (FileReader reader = new FileReader(fileName);
				BufferedReader br = new BufferedReader(reader);) {
			// 홍길동,98,89,20,207,69.000000,true
			String info = br.readLine();
			/*String pattern = "이름:{0}, 국어:{1}, 영어:{2}, 수학:{3}, 총점:{4}, 평균:{5}, 성별{6} 입니다.";
			MessageFormat mf = new MessageFormat(pattern);
			String s = mf.format(info);
			System.out.println(s);*/
			
			System.out.println(info);

			String pattern ="{0},{1},{2},{3},{4},{5},{6}";
			MessageFormat mf = new MessageFormat(pattern);
			Object [] datas = mf.parse(info);
			String name = (String) datas[0];
			
			int kor = Integer.parseInt( (String) datas[1] );
			/*
			int eng = (int) datas[2];
			int mat = (int) datas[3];
			int tot = (int) datas[4];
			double avg = (double) datas[5];
			boolean gender = (boolean) datas[6];

			System.out.printf("%s %d %d %d %f %b\n"
					, name, kor, eng, mat, avg, gender);
			*/
		} catch (Exception e) {
			e.printStackTrace();
		}

	} // main

} // class
