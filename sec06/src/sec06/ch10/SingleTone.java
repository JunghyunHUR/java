package sec06.ch10;

public class SingleTone {
	private static SingleTone singleTone = new SingleTone();
	private SingleTone() {}
	
	static SingleTone getInstance() {
		return singleTone;
	}

}
