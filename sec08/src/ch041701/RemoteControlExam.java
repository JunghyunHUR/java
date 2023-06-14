package ch041701;

public class RemoteControlExam {

	public static void main(String[] args) {

		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(50);
		rc.turnOff();
		
		rc = new Radio();
		rc.turnOn();
		rc.setVolume(-5);
		rc.turnOff();
		
		//default method 호출
		rc.setMute(true);
		rc.setMute(false);
		System.out.println("-------------------------");
		
		RemoteControl.changeBattery();
	}

}
