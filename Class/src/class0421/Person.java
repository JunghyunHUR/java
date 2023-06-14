package class0421;

public class Person {
	
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void info() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}

}
