package days17;

import java.util.Arrays;
import java.util.Collections;

public class Ex01_03 {

	public static void main(String[] args) {
		
		String [] names = {"김재민", "김선우", "김인경", "송세호", "전재윤"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		Arrays.sort(names, Collections.reverseOrder());
		System.out.println(Arrays.toString(names));
	}

}