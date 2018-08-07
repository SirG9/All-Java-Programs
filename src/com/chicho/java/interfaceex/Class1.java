package com.chicho.java.interfaceex;

public class Class1 implements Interface1, Interface2 {

	public static void main(String[] args) {
		Class1 c1 = new Class1();
		c1.method1();
		c1.method2();
		c1.log("LOG");
	}

	public void method2() {
		System.out.println("Method-1 to definition goes here...");
	}

	public void method1() {
		System.out.println("Method-2 to definition goes here...");
	}

	// This method is declated in both interfaces hence it is mandatory to
	// provide the definition
	public void log(String str) {
		//Interface1.super.log(str);
		System.out.println("My Class loggin::"+str);
	}

}
