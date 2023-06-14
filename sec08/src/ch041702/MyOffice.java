package ch041702;

public class MyOffice {

	public static void main(String[] args) {
		
		Object im = new Employee("홍길동", "대리");
		System.out.println(im.toString());

		Drivable dd = new Driver("슈마허", "사원", "123조 0102" );
		System.out.println(dd);
		
		dd.drive();
		
		Drivable ddd = new Transporter();
//		ddd.setCarNo("222거1234");
		ddd.drive();
		
	}

}
