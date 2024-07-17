package days13;

/**
 * @author lsh
 * 	@date 2024. 7. 17. - 오후 3:37:08
 * @subject			[static 키워드]
 *	@content			Save 저축 클래스
 * 
 */
public class Ex08 {

	public static void main(String[] args) {
		/*
		Save s1 = new Save ("김선우", 1000, 0.03);
		Save s2 = new Save ("김인경", 10000, 0.03);
		Save s3 = new Save ("김재민", 5000, 0.03);
		Save s4 = new Save ("김준석", 15000, 0.03);
		Save s5 = new Save ("박준용", 1000, 0.03);
		
		s1.dispSave();
		s2.dispSave();
		s3.dispSave();
		s4.dispSave();
		s5.dispSave();
		*/
		
		/*
		Save [] sArr = new Save[5];
		
		sArr[0] = new Save ("김선우", 1000, 0.03);
		sArr[1] = new Save ("김인경", 10000, 0.03);
		sArr[2] = new Save ("김재민", 5000, 0.03);
		sArr[3] = new Save ("김준석", 15000, 0.03);
		sArr[4] = new Save ("박준용", 1000, 0.03);
		*/
		
		// 클래스 변수 접근 // 객체를 만들지 않아도 프로그램 시작과 동시에 메모리에 올라가 있음.
		// 클래스명.클래스변수
		// The field Save.rate [is not visible]
		// System.out.println(Save.rate);
		
		Save.setRate(0.05);
		
		
		Save [] sArr = {
				new Save ("김선우", 1000, 0.03),
				new Save ("김인경", 10000, 0.03),
				new Save ("김재민", 5000, 0.03),
				new Save ("김준석", 15000, 0.03),
				new Save ("박준용", 1000, 0.03)
								};
		
		//sArr[2].setRate(0.07); // 객체 생성 돼있으면 객체로도 접근가능
		
		for (int i = 0; i < sArr.length; i++) {
			sArr[i].dispSave();
		} // for i

	} // main

} // class
