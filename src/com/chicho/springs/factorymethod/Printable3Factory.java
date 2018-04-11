package com.chicho.springs.factorymethod;

public class Printable3Factory {
	// non-static factory method
	public Printable2 getPrintable() {
		return new A2();// return any one instance, either A or B
	}
}