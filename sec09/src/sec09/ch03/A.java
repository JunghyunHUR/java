package sec09.ch03;

public class A {
	//field
	int field1;
	
	//method
	void method1() {
		
	}
	//static field
	static int field2;
	
	//static method
	static void method2() {
		
	}
	
	//instance member class
	class B{
		
		void method() {
			//use instance field, method of A
			field1 = 10;
			method1();
			
			//use static field, method of A
			field2 = 10;
			method2();
		}
	}

}
