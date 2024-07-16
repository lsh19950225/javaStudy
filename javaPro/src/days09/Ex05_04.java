package days09;

public class Ex05_04 {

	public static void main(String[] args) {
		// int [] m = new int [24];
		// int [][] m = new int [4][6];
		// int [][][] m = new int [2][3][4]; // 2면 3행 4열
		int [][][] m = {
				{
					{1,2,3,4},
					{5,6,7,8},
					{5,6,7,8}
				},
				{
					{1,2,3,4},
					{5,6,7,8},
					{5,6,7,8}
				},
				{
					{1,2,3,4},
					{5,6,7,8},
					{5,6,7,8}
				}
		};
		System.out.println(m.length); // 3차원 : 면 갯수

		System.out.println( m[0].length ); // 3차원 : 행 갯수

		System.out.println( m[0][0].length ); // 3차원 : 열 갯수

		dispM(m);


	} // main

	private static void dispM(int[][][] m) {

		for (int i = 0; i < m.length; i++) {
			System.out.println(i + "면");
			for (int j = 0; j < m[i].length; j++) {
				for (int k = 0; k < m[i][j].length; k++) {
					System.out.printf("m[%d][%d][%d]=%d", i,j,k,m[i][j][k]);
				} // for k
				System.out.println();
			} // for j
			System.out.println();
		} // for i

	}

} // class
