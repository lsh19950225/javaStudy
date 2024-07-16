package days08;

public class Ex01 {

	public static void main(String[] args) {

		int lottoNumber;

		int [] lotto = new int[6];

		fillLotto(lotto);

		dispLotto(lotto);

	} // main

	private static void fillLotto(int[] lotto) {
		int lottoNumber;
		lotto[0] = (int)(Math.random()*45)+1;
		System.out.println(lotto[0]);
		// [23][0][0][0][0][0]
		int index = 1;
		boolean isDuplicate = false;
		while (index <= 5) {
			isDuplicate = false;
			lottoNumber = (int)(Math.random()*45)+1;
			// 중복체크를 한 후에 중복되지 x
			System.out.println(lottoNumber);
			
			for (int i = 0; i < index; i++) {
				if(lotto[i] == lottoNumber) {
					isDuplicate = true;
					break;
				}
			}
			if(!isDuplicate) lotto[index++] = lottoNumber;
			
		} // while
	
	}

	private static void dispLotto(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%d]",lotto[i]);
		}
		System.out.println();
	}

} // class
