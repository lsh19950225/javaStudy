package days06;

import java.util.Random;

public class Ex04_04 {

	public static void main(String[] args) {
		
		// 16. 람다식
		// 17. 스트림 요소 처리
		
		
		// 아래 한 줄 암기
		// int [] m = new Random().ints(1, 101).limit(10).toArray();
		
		//             IntStream                                    OptionalInt
		int max = new Random().ints(1,101).limit(10).min().getAsInt();
		System.out.println(max);
		
		//int [] m = new Random().ints(1,101).limit(10).toArray();
		
		
		
		
		
		
		/*
		// java.ntil.Random 클래스
		Random rnd = new Random();
		// rnd.nextInt(int bound);
		int kor = rnd.nextInt(101);
		int lotto = rnd.nextInt(45)+1;
		//		rnd.nextBoolean(); true, false
		//		rnd.nextInt(); : 21억
		//		rnd.nextLong(); : 900경
		*/
	}

}
