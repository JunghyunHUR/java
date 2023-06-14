package ch15;

import java.lang.reflect.Method; //동적으로 실행할 때 클래스의 정보를조사 reflect

public class ServiceExam {

	public static void main(String[] args) {
		Method[] declaredMethods = Service.class.getDeclaredMethods();

		for(Method method : declaredMethods) {
			//향상된 포문 - 옛날 포문 for(int i = 0; i < declaredMethods; i++){}
//			System.out.println(method.getName()); //메소드 이름 출력
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
//				System.out.println(method.getName());
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
//				System.out.println(method.getName() + ": ");
//				System.out.println("value : " + printAnnotation.value());
//				System.out.println("num : " + printAnnotation.number() + '\r');
				
				//메소드 이름 출력
				System.out.println("{" + method.getName() + "}");
				for(int i = 0; i < printAnnotation.number(); i++) {
				// 구분선 출력
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				//메소드 호출 -- 예외처리 해야 함
				try {
					method.invoke(new Service());
				}catch(Exception e) {}
				System.out.println();
				
			}
		}
	}

}
