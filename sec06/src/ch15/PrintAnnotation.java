package ch15;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//적용되는 영역은 메소드
@Target({ElementType.METHOD})

//유지정책은 런타임
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	
	String value() default "-";
	int number() default 15;
}
