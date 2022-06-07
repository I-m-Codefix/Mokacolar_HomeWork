package com.example.first_practice.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //annotation의 사용처가 어디인지 => Method
@Retention(RetentionPolicy.RUNTIME) //Runtime동안 annotation 유지
public @interface LogExecutionTime {
}

