package com.chicho.springs.factorymethod;

public class A1 {
	private static final A1 obj = new A1();

	private A1() {
		System.out.println("private constructor");
	}

	public static A1 getA() {
		System.out.println("factory method ");
		return obj;
	}

	public void msg() {
		System.out.println("hello user");
	}
}