package sec09.ch03;

public class A2 {

	// field, method of A
	String field = "A-field";
	void method() {
		System.out.println("A-method");
	}
	
	class B{
		//field, method of B
		String field = "B-field";
		void method() {
			System.out.println("B-method");
		}
		void print() {
			//use field, method from B object
			System.out.println(this.field);
			this.method();
			
			//use field, method from A object
			System.out.println(A2.this.field);
			A2.this.method();
		}
	}
	// instance method of A
	void useB() {
		B b = new B();
		b.print();
		
	}
}
