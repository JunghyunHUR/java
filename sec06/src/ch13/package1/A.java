package ch13.package1;

public class A {
	//필드
	A a1 = new A(true);
	A a2 = new A();
	A a3 = new A("문자열");
	//생성자
	public A(boolean b) {} // public - 공개 생성자
	A(){} // default;
	private A(String s) {} //private

}
