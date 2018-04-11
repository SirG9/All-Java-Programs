package com.chicho.springs.autowiring;

public class A {
	B b12;
	// Reference name must be same as Bean ID, or else it will fail, and further
	// internally it uses setter method for injecting dependencies

	A() {
		System.out.println("A is created");
	}

	public B getB12() {
		return b12;
	}

	public void setB12(B b) {
		this.b12 = b;
	}

	void print() {
		System.out.println("Hello A");
	}

	void display() {
		print();
		b12.print();
	}
}