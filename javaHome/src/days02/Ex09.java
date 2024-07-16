package days02;

public class Ex09 {

	public static void main(String[] args) {
		double pi;
		pi = 3.141592;
		System.out.printf("%.3f\n", pi);
		
		String strPi = String.format("%.3f\n", pi);
		double dPi = Double.parseDouble(strPi);
		System.out.println(dPi);
		
		int iPi = (int) (pi*1000+0.5);
		System.out.println((double) iPi/1000);
		
		
		/*char lowerCase = 'x', upperCase;
		upperCase = (char) (lowerCase - 32);
		System.out.println(upperCase);
		
		char lower;
		lower = 'a';
		char upper;
		upper = (char)(lower - 32);
		System.out.println(upper);*/
		
		char upper;
		upper = 'B';
		char lower;
		lower = (char)(upper + 32);
		System.out.println(lower);
		
		int n = 10;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toOctalString(n));
		System.out.println(Integer.toHexString(n));
		

	}

}
