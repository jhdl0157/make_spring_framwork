package com.ll.exam.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //메서드에 붙는거다.
@Retention(RetentionPolicy.RUNTIME) //
public @interface GetMapping {
    String value(); //어노테이션 달때, value입력 가능하게
}
