package sec05.ch07;

public class EnumMethodExam {

	public static void main(String[] args) {
		//main() method
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		// ordinal() 열거 객체의 순번을 리턴
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		//compareTo() 순번차이를 리턴
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		
		System.out.println(result1);
		System.out.println(result2);
		
		// values() 배열로 리턴
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
	}

}
