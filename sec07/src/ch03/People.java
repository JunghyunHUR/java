package ch03;

public class People {
	//필드
	public String name;
	public String ssn;
	
	//생성자
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		System.out.println("부모객체 생성완료");
	}
	
	//메소드

}
