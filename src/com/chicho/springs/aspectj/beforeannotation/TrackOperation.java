package com.chicho.springs.aspectj.beforeannotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/*The AspectJ Before Advice is applied before the actual business logic method.
 * You can perform any operation here such as conversion, authentication etc.*/

@Aspect
public class TrackOperation {

	@Pointcut("execution(* Operation.*(..))")
	public void k() {
	}// pointcut name

	@Before("k()") // applying pointcut on before advice
	public void myadvice(JoinPoint jp)// it is advice (before advice)
	{
		System.out.println("additional concern");
		// System.out.println("Method Signature: " + jp.getSignature());
	}
}

/********** Pointcur various samples ******/

// @Pointcut("execution(* Operation.*(..))")
/* additional concern will be applied for all the methods in Operation class */

// @Pointcut("execution(* Operation.m*(..))")
/*
 * additional concern will be applied for the methods starting with m in
 * Operation class
 */

// @Pointcut("execution(public * *(..))")
/* It will be applied on all the public methods. */

// @Pointcut("execution(public Operation.*(..))")
/* It will be applied on all the public methods of Operation class. */

// @Pointcut("execution(* Operation.*(..))")
/* It will be applied on all the methods of Operation class. */

// @Pointcut("execution(public Employee.set*(..))")
/* It will be applied on all the public setter methods of Employee class. */

// @Pointcut("execution(int Operation.*(..))")
/*
 * It will be applied on all the methods of Operation class that returns int
 * value.
 */