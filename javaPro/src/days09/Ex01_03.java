package days09;

/**
 * @author lsh
 * @date 2024. 7. 11. - 오후 12:35:18
 * @subject
 * @content
 *
 */
public class Ex01_03 {

	public static void main(String[] args) {

		// int year = 2024;

		for (int year = 2020; year <= 2025; year++) {
			for (int mouth = 1; mouth <= 12; mouth++) {
				Ex01.printCalender(year, mouth);
			}
			System.out.println("=".repeat(24));
		}






	} // main

} // class
