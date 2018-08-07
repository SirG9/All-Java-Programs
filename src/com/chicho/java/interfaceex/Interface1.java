package com.chicho.java.interfaceex;

@FunctionalInterface /*
						 * An interface with exactly one abstract method is known
						 * as Functional Interface. @FunctionalInterface
						 * annotation is a facility to avoid accidental addition
						 * of abstract methods in the functional interfaces.
						 * It’s optional but good practice to use it.
						 */
public interface Interface1 {
	void method1();

	default void log(String str) {
		System.out.println("I1 loggin::" + str);
	}

}
