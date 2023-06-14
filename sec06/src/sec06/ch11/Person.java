package sec06.ch11;

public class Person {
	//필드
	final String nation = "Korea";
	final String ssn;
	String name;

	//생성자
	//final field는 바뀌지 않는다.
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
