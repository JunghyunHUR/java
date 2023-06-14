package class0421;

public class Employee {
	String name;
	String jobtitle;
	int payment;
	
	void increas(int rate) {
		int increas = this.payment + this.payment * rate / 100;
		System.out.println(this.name + " " + this.jobtitle + "님의 급여는 ");
		System.out.print(increas + "원 인상되어");
		this.payment = payment + increas;
		System.out.println(payment + "원이 되었습니다.");
		
	}

}
