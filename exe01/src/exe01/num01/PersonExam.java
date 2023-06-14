package exe01.num01;

public class PersonExam {
	
	public static void main(String[] args) {
		
		Person person1 = new Person("김철수", 28);
		Person person2 = new Person("홍길동", 25);
		Person person3 = new Person();
		
		person3.setName("안철수");
		person3.setAge(30);
		
		System.out.println(person1.getName() + "는 올해 " + person1.getAge() + "살이 되었습니다.");
		System.out.println(person2.getName() + "은 올해 " + person2.getAge() + "살이 되었습니다.");
		System.out.println(person3.getName() + "는 올해 " + person3.getAge() + "살이 되었습니다.");
	}

}
