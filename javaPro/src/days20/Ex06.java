package days20;

import javax.sound.midi.SysexMessage;

/**
 * @author lsh
 * 	@date 2024. 7. 26. - 오후 2:01:07
 * @subject
 *	@content
 * 
 */
public class Ex06 {

	public static void main(String[] args) {
		
		Button callButton = new Button(new CallListener());
		callButton.touch();
		
		Button messageButton = new Button();
		messageButton.setListener(new MessageListener());
		messageButton.touch();
		
	} // main

} // class

// 버튼 - 클릭이벤트 발생 -> 처리
class Button {
	
	// 필드
	OnClickListener listener;
	
	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	Button(){}
	Button(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		this.listener.onClick();
	}
	
	// 중첩 인터페이스
	interface OnClickListener {
		void onClick(); // 추상메서드
		
	}
	
}

// Button.OnClickListener 구현한 클래스 선언
class CallListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("전화를 건다.");
		
	}
	
}


class MessageListener implements Button.OnClickListener {
	
	@Override
	public void onClick() {
		System.out.println("문자 메세지를 전송한다.");
		
	}
	
}


