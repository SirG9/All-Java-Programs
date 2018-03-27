package com.chicho.java.basicprogram;

//Factorial Program using loop in java
class FactorialExample1 {
	public static void main(String args[]) {
		int i, fact = 1;
		int number = 5;// It is the number to calculate factorial
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);
	}
}
