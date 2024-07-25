package days19;

import java.util.Stack;

/**
 * @author lsh
 * 	@date 2024. 7. 25. - 오후 12:21:52
 * @subject
 *	@content
 * 
 */
public class Ex04 {

	public static void main(String[] args) {

			
		/*
		 * [스택 Stack] 구조와 큐(Queue) 구조
		 * LIFO 구조		push(), pop(), empty(), search()
		 * 									peek()
		 * -> C B A
		 * 
		 */
		Stack s = new Stack();
		s.push("박준용");
		s.push("김준석");
		s.push("김재민");
		s.push("전재윤");
		
		// s.iterator(); x
		// System.out.println(s.pop()); // 3
		// System.out.println(s.peek()); // 4
		// System.out.println(s.size());
		
		// System.out.println(s.search("김재민"));
		// System.out.println(s.indexOf("김재민"));
		
		while (!s.empty()) {
			System.out.println(s.pop());
		}
		
		
		
	} // main

} // class
