package ch07.ex04;

public class SmartPhone extends Phone{

	public SmartPhone(String owner) {
		super(owner);
	}
	public void internetSearch() {
		System.out.println("인터넷을 검색 합니다.");
	}

}
