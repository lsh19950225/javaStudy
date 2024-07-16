package days11;

/**
 * @author lsh
 * @date 2024. 7. 15. - 오후 5:12:11
 * @subject
 * @content
 *
 */
public class Ex06 {

	public static void main(String[] args) {

		int [][] m = new int [5][5];
		//magicSquare(m);
		//fillM6(m);
		fillM5(m);
		//fillM4(m);
		//fillM3(m);
		//fillM2(m);
		//fillM(m);

		dispM(m);

	} // main

	private static void magicSquare(int[][] m) {
		/*
		[17][24][01][08][15]
		[23][05][07][14][16]
		[04][06][13][20][22]
		[10][12][19][21][03]
		[11][18][25][02][09]
		 */
		// 1. 0행 2열 == 1
		// 2. 출력값이 5의 배수 o 행만 증가
		//                          x 행 감소, 열 증가
		//                               ㄴ 행 x -> 가장 큰 행
		//                               ㄴ 열 x -> 가장 작은 열
		int n = 1;
		int row=0, col=m[0].length/2; // 행, 열
		while (n<=25) {
			m[row][col] = n;
			if (n%5==0)
				row++;
			else {
				col++;
				row--;
				if(row == -1) row = m.length-1;
				else if(col == 5) col = 0;
			}
			n++;
		}

	}


	private static void fillM6(int[][] m) {
		// 대각선
		//	[01][02][04][07][11]
		//	[03][05][08][12][16]
		//	[06][09][13][17][20]
		//	[10][14][18][21][23]
		//	[15][19][22][24][25]

	}

	private static void fillM5(int[][] m) {
		// [골뱅이]
		/*
		  [01][02][03][04][05] // 행고정, 열증가(5번)
		  [16][17][18][19][06] // 열고정, 행증가(4번)
		  [15][24][15][20][07] // 행고정, 열감소(4번)
		  [14][23][22][21][08] // 열고정, 행감소(3번)
		  [13][12][11][10][09] // 행고정, 열증가(3번)
		                                    // 열고정, 행증가(2번)
		                                    // 행고정, 열감소(2번)
		                                    // 열고정, 행감소(1번)
		                                    // 행고정, 열증가(1번)
		 */
		
		
	}

	private static void fillM4(int[][] m) {
		/* 지그재그
		[01][02][03][04][05]
		[10][09][08][07][06]
		[11][12][13][14][15]
		[20][19][18][17][16]
		[21][22][23][24][25]
		 */
		int count = 0;
		for (int i = 0; i < m.length; i++) { // 행갯수
			for (int j = 0; j < m[i].length; j++) { // 열갯수
				// 열갯수
				m[i][j] = (m[i].length * i+1) + j;
				//                  5             0    0
			} // for j
			System.out.println();
		} // for i

	}



	private static void fillM3(int[][] m) {
		/*
		[05][10][15][20][25]
		[04][09][14][19][24]
		[03][08][13][18][23]
		[02][07][12][17][22]
		[01][06][11][16][21]
		 */
		int count = 0;
		for (int i = 0; i < m.length; i++) { // 행갯수
			for (int j = 0; j < m[i].length; j++) { // 열갯수
				// 열갯수
				m[i][j] = (m[i].length * (j+1)) - i;
				//                  5                 0        0
			} // for j
			System.out.println();
		} // for i

	}

	private static void fillM2(int[][] m) {
		/*int count = 0;
		for (int i = 0; i < m.length; i++) { // 행갯수
			for (int j = 0; j < m[i].length; j++) { // 열갯수
				// 열갯수
				m[i][j] = 25 - (m[i].length * i + j);
			} // for j
			System.out.println();
		} // for i*/

		int count = 0;
		for (int i = 0; i < m.length; i++) { // 행갯수
			for (int j = 0; j < m[i].length; j++) { // 열갯수
				// 열갯수
				m[4-i][4-j] = m[i].length * i + j+1;
			} // for j
			System.out.println();
		} // for i

	}

	private static void fillM(int[][] m) {
		int count = 0;
		for (int i = 0; i < m.length; i++) { // 행갯수
			for (int j = 0; j < m[i].length; j++) { // 열갯수
				// 열갯수
				m[i][j] = m[i].length * i + j+1;
			} // for j
			System.out.println();
		} // for i

	}

	private static void dispM(int[][] m) {

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(); 

		for (int i = 0; i < m.length; i++) { // 행갯수
			for (int j = 0; j < m[i].length; j++) { // 열갯수
				System.out.printf("[%02d]", m[i][j]);
			} // for j
			System.out.println();
		} // for i

	}

} // class
