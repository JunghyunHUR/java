package ch03;

public class Student extends People{

	public int studnetNo;
	
	//생성자
	public Student(String name, String ssn, int studnetNo) {
		super(name, ssn);
		this.studnetNo = studnetNo;
		System.out.println("학생객체 생성완료");
	}
}
