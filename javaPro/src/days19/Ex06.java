package days19;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author lsh
 * 	@date 2024. 7. 25. - 오후 12:46:25
 * @subject
 *	@content
 * 
 */
public class Ex06 {

	public static void main(String[] args) {
		
		// AL, V, LL, S, LL
		// PriorityQueue
		// 우선순위 + 큐 FIFO x
		// 우선순위가 높은 것 부터 꺼내오는 큐..
		// (작은 숫자가 우선 순위가 높다.)
		Queue q = new PriorityQueue();
		q.offer(3);
		q.offer(5);
		q.offer(2);
		q.offer(4);
		q.offer(1);
		// System.out.println(q);
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}


	} // main

} // class
