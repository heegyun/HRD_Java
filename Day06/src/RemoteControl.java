
public interface RemoteControl {
	// 구성요소..
	// 상수필드, 추상메소드
	
	// static final double PI = 3.141459;
	// 상수필드
	static final int MAX_VOLUME = 10;
	static final int MIN_VOLUME = 0;
	
	// 추상 메소드
	void turnOn();
	void turnOff();
	void setVolum(int volume);
	 
	// 디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
			setVolum(MIN_VOLUME);
		} else{
			System.out.println("무음 해제합니다.");
		}
	}
	
	// static (정적) 메소드
	// 구현객체 없이 호출가능
	static void changeBattery() {
		System.out.println("리모콘 건전지를 교환합니다.");
	}
	
	
	
	
	
	
}
