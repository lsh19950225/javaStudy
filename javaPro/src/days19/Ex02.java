package days19;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.function.Consumer;

/**
 * @author lsh
 * 	@date 2024. 7. 25. - 오전 11:10:25
 * @subject					C
 *	@content		List				Set							Map
 * 						1) Arraylist
 * 						2) [Vector 컬렉션 클래스]
 * 							차이점 : 멀티 스레드 안전(동기화 처리 o)
 * 
 * 
 * 		StringBuffer 멀스 안전 o, 동기화 o
 * 		StringBuilder 멀스 안전 x, 동기화 x
 */
public class Ex02 {

	public static void main(String[] args) {
		
		Vector vt = new Vector(); // 10
		vt.addElement("김재민");
		vt.addElement("전재윤");
		vt.addElement("김선우");
		vt.addElement("최사랑");
		vt.addElement("김선우");
		vt.addElement(null);
		System.out.println(vt);
		
		System.out.println(vt.size());
		System.out.println(vt.capacity());
		vt.trimToSize(); // 사이즈 자름
		System.out.println(vt.capacity());
		// vt.setSize(10);
		// System.out.println(vt.capacity());
		
		System.out.println(vt.get(1));
		System.out.println(vt.elementAt(2));
		
//		vt.remove(1);
//		vt.removeElementAt(1);
//		vt.remove("홍길동"); // true / false
//		vt.removeElement("홍길동");
		vt.removeIf(e -> e == null);
		
		System.out.println("-".repeat(20));
		
		/*vt.forEach(new Consumer<String>() { // Consumer : 리턴값 없고, 무조건 매개변수 1

			@Override
			public void accept(String n) {
				// TODO Auto-generated method stub
				System.out.println(n);
			}
		});*/
		
		// vt.forEach(n -> System.out.println(n));
		vt.forEach(System.out::println); // 메서드 참조
		
		System.out.println("-".repeat(20));
		
		// vt.clear();
		// vt.removeAllElements();
		
		vt.set(1, "XXX");
		vt.setElementAt("YYY", 1);
		
		// 모든 요소 출력 : 반복자 Iterator
		
		Iterator ir = vt.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}
		
		vt.firstElement(); // == vt.get(0);
		vt.lastElement(); // vt.get(vt.size()-1);
		
		int index = vt.indexOf("YYY");
		System.out.println(index);
		vt.insertElementAt("이시훈", index+1);
		System.out.println(vt);
		
//		Vector subVt = new Vector();
//		for (int i = 2; i <= 4; i++) {
//			subVt.addElement(vt.get(i));
//		}
		
		List subList = vt.subList(2, 5);
		
		System.out.println(subList);
		
	} // main

} // class
