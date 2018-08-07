package com.chicho.java8.lambda;

public class Test {

	public static void main(String[] args) {
		operation stringLength = s -> s.length();
		System.out.println(stringLength.getStringLength("Hello Lambda"));

	}
}

@FunctionalInterface
interface operation {
	int getStringLength(String a);
}