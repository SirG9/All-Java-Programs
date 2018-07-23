package com.chicho.java.lambda;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operation stringLength = s -> s.length();
		System.out.println(stringLength.getStringLength("Hello Lambda"));
	}
}

interface operation {
	int getStringLength(String a);
}