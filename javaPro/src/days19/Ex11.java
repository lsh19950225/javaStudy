package days19;

import java.util.SortedSet;
import java.util.TreeSet;

public class Ex11 {

	public static void main(String[] args) {
		
		/*
		 * Set : HashSet, LinkedHashSet
		 * [TreeSet] 컬렉션 클래스
		 * 1. 중복 x, 순서 x
		 * 2. "이진 검색 트리"라는 자료 구조로 데이터를 저장하는 컬렉션 클래스
		 * 3. 링크드리스트 처럼 노드(Node)가 서로 연결된 구조.
		 * 		class TreeNode {
		 * 		Object value
		 * 		
		 * 		TreeNode left;
		 * 		TreeNode right;
		 * 		}
		 * 4. 최상위 노드 == 루트(root) 노드
		 * 5. 노드들 간의 관계 : 부모노드, 자식노드, 형제노드
		 * 
		 * 												[0x100][7][0x200]
		 * 
		 * 							[0x300][4][0x400]							[null][9][null]
		 * 							0x100										0x200
		 * 
		 * [null][1][null]						[null][5][0x500]
		 * 0x300									0x400
		 * 																	[null][6][null]
		 * 																	0x500
		 */
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(7);
		ts.add(4);
		ts.add(9);
		ts.add(1);
		ts.add(5);
		ts.add(6);
		
		System.out.println(ts); // 정렬
		
		System.out.println(ts.first());
		System.out.println(ts.last());
		
		// 범위 검색
		SortedSet<Integer> ss = ts.subSet(4, 7); // 4 5 6
		System.out.println(ss);
		
		// 1보다 큰 값을 가진 가장 가까운 수(값)을 반환
		System.out.println(ts.higher(1)); // 4
		System.out.println(ts.lower(4)); // 1
		
		// 지정된 값(3)과 같은 객체를 반환
		// 트리구조에서 3값이 없으면 작은 값을 가진 객체
		//	중에 가장 가까운 값.
		System.out.println(ts.floor(3)); // 1
		System.out.println(ts.ceiling(3)); // 4
		
	}

}
