package my.shop;

public class Button {
	
	//중첩 인터페이스
	static interface ClickListener{
		
		// 추상메소드
		void onClick();
	}

	// 필드선언	
	ClickListener clicklistner;
	
	// 필드 초기화
	public void setClickListener(ClickListener clicklistener) {
		this.clicklistner = clicklistener;
	}
	
	void click() {
		this.clicklistner.onClick();
	}

	
}
