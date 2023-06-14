package sec08.ch02;

public class RemoteControlExam {
	
	public static void main(String[] args) {
		
		System.out.println("리모컨 최대 볼륨 : " + RemoteControl.MAX_VOLUME);
		System.out.println("리모컨 최소 볼륨 : " + RemoteControl.MIN_VOLUME);
		
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(99);
		rc.turnOff();
	}

}
