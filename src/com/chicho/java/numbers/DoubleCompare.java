package com.chicho.java.numbers;

public class DoubleCompare {

	public static void main(String[] args) {
		double employeeSalary = 1.0;

		if (Double.compare(employeeSalary, Double.valueOf(0.0)) > 0) {
			System.out.println("d1 is greater than d2");
		} else if (Double.compare(-15.45, 11.50) < 0) {
			System.out.println("d1 is less than d2");
		}
	}
}
