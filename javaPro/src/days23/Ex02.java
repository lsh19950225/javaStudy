package days23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Ex02 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		// list.forEach(i-> System.out.println(i));
		// 메서드 참조
		list.forEach(System.out::println); // ::
		list.removeIf(i-> i%2==0); // 짝수 삭제
		System.out.println(list);
		
		list.replaceAll(i-> i*2);
		System.out.println(list);
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
		map.forEach((k,v)-> System.out.println(k+"/"+v));
		
		
		
	} // main

} // class
