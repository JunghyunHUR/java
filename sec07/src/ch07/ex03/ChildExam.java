package ch07.ex03;

public class ChildExam {

	public static void methodA(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child)parent;
			child.field2 = "data";
			child.method1();
			child.method2();
			child.method3();
		}else {
			System.out.println("타입변환이 불가능 합니다.");
		}
	}
	public static void methodB(Parent parent) {
		Child child = (Child)parent;
		System.out.println("methodB - Child로 변환 성공");
	}
	public static void main(String[] args) {
		
		Parent parent = new Child();
		methodA(parent);
		methodB(parent);
		
		Parent parent1 = new Parent();
		methodA(parent1);
		methodB(parent1);
		
		
		/*
		parent.field2 = "data";
		parent.method3();
		*/
		
		if(parent instanceof Child) {
			Child child = (Child)parent;
			System.out.println();
			child.field2 = "data";
			child.method1();
			child.method2();
			child.method3();
			System.out.println();
		}else {
			System.out.println("자식타입으로 변환이 불가능 합니다.");
		}
		
		Child child = (Child)parent;
		
		child.field2 = "data";
		child.method1();
		child.method2();
		child.method3();
	}
}
