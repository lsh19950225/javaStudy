package days03;

/**
 * @author lsh
 * @date 2024. 7. 3. - 오후 5:16:38
 * @subject 증감연산자 ++ --
 * @content
 *
 */
public class Ex05_06 {

	public static void main(String[] args) {
		// 어떤 기억공간의 값을 1증가 또는 감소 시키는 코딩
		int n = 10;
		System.out.println(n);
		// n += 1; // += 복합대입연산자
		
		// 단독으로 사용될 때는 전위형/후위형 차이가 없다
		// n++; 후
		// ++n; 전
		System.out.println(n);

	}

}
