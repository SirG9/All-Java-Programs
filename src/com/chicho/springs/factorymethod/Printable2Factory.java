package com.chicho.springs.factorymethod;

public class Printable2Factory {
	public static Printable2 getPrintable() {
		// return new B2();
		return new A2();// return any one instance, either A2 or B2
	}
}