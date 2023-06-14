package sec08.ch02;

public interface RemoteControl {
	//상수 static final
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//public 추상 메소드
	public void turnOn();
	
	//default 추상 메소드 - 실행영역 없이 메소드의 선언부만 작성
	void turnOff();
	void setVolume(int volume);

}
