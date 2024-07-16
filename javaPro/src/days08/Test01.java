package days08;

public class Test01 {

	public static void main(String[] args) {

		int lottoNumber;

		int [] lotto = new int [6];

		fillLotto(lotto);

		dispLotto(lotto);





	} // main

	private static void dispLotto(int[] lotto) {

		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%d]", lotto[i]);
		}
		System.out.println();

	}

	private static void fillLotto(int[] lotto) {
		/*
		int lottoNumber;
		lotto [0] = (int)(Math.random()*45)+1;
		System.out.println(lotto[0]);
		int index = 1;
		boolean check = false;
		while (index <= 5) {
			check = false;
			lottoNumber =  (int)(Math.random()*45)+1;
			System.out.println(lottoNumber);

			for (int i = 0; i < lotto.length; i++) {
				if (lotto[i] == lottoNumber) {
					check = true;
					break;
				}
			}
			if(!check) lotto[index++] = lottoNumber;
		}
		 */
		int lottoNumber;
		lottoNumber = (int)(Math.random()*45)+1;
		System.out.println(lotto[0]);
		
		int index = 1;
		
		while (index<=5) {
			lottoNumber = (int)(Math.random()*45)+1;
			System.out.println(lottoNumber);
			if(!isDuplicate(lotto,lottoNumber,index))
				lotto[index++] = lottoNumber;
		}


	}

	private static boolean isDuplicate(int[] lotto, int lottoNumber, int index) {
		for (int i = 0; i < index; i++) {
			if(lotto[i] == lottoNumber) return true;
		}
		return false;
	}

} // class
