package class06;

public class Member {
	
	String name;
	String id;
	String password;
	int age;
	
	Member(String name, String id){
		this.name = name;
		this.id = id;
	}
	
	public static void main(String[] args) {
		Member user1 = new Member("홍길동", "hong");
		Member user2 = new Member("강자바", "java");

	}

}
