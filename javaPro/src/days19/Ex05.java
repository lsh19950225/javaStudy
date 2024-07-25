package days19;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lsh
 * 	@date 2024. 7. 25. - 오후 12:36:25
 * @subject
 *	@content
 * 
 */
public class Ex05 {

	public static void main(String[] args) {
		
		// 큐 구조
		// FIFO
		// offer(), poll() / peek()
		// 더블 큐(Deque) 구조
		// Deque q = new LinkedList(); // 큐로 사용가능.
		Queue q = new LinkedList(); // 큐로 사용가능.
		q.offer("전재윤");
		q.offer("김재민");
		q.offer("김준석");
		q.offer("박준용");
		System.out.println(q);
		System.out.println(q.size());
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
		// Deque
		// q.offerFirst(q);
		// q.offerLast(q);
		
		

	} // main

} // class
