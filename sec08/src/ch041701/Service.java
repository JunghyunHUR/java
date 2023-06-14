package ch041701;

public interface Service {
	default void defaultMethoad1() {
		System.out.println("defaultMehod1 종속 코드");
		defaultCommon();
	}
	default void defaultMethoad2() {
		System.out.println("defaultMehod2 종속 코드");
		defaultCommon();
	}
	
	//private method
	private void defaultCommon() {
		System.out.println("defaultMehod1 중복 코드A");
		System.out.println("defaultMehod1 중복 코드B");
	}
	
	static void staticMethod1() {
		System.out.println("staticMethod1 종속 코드");
		System.out.println("staticMethod 중복 코드A");
	}
	static void staticMethod2() {
		System.out.println("staticMethod2 종속 코드");
		staticCommon();
	}
	
	//private static method
	private static void staticCommon() {
		System.out.println("staticMethod 중복 코드A");
		System.out.println("staticMethod 중복 코드B");
	}
}
