package days19;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author lsh
 * 	@date 2024. 7. 25. - 오후 4:08:53
 * @subject
 *	@content
 * 
 */
public class Ex11_02 {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<>();

		ts.add("abc");      ts.add("alien");      ts.add("bat");
		ts.add("car");      	ts.add("Car");      ts.add("disc");
		ts.add("dance");      ts.add("dzzz");      ts.add("dzzzz");
		ts.add("elephant");      ts.add("elevator");      ts.add("fan");
		ts.add("flower");
		
		String regex = "[a-c].*";
		System.out.println(ts); // 오름차순 정렬.
		
		// SortedSet<String> ss = ts.subSet("a", "d");
		SortedSet<String> ss = ts.subSet("c", "dzzz"); // c<= ?? <dzzz
		System.out.println(ss);

	} // main

} // class
