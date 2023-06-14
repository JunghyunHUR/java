package ch041701;

public interface RemoteControl {

	//필드 (상수)
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 method
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음 해제합니다.");
			
		}
	}
	
	static void changeBattery() {
		System.out.println("리모컨의 건전지를 교환합니다.");
	}
	
	
}
