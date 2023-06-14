package sec06.ch11;

public class PersonExam {

	public static void main(String[] args) {
		
		Person p1 = new Person("200101-1234567", "이순신");
		
		System.out.println(p1.nation);
		System.out.println(p1.name);
		System.out.println(p1.ssn);
		
		p1.name = "홍길동";
//		p1.ssn = "191212-1234567";
		System.out.println(p1.name);
		System.out.println(p1.ssn);

	}

}
