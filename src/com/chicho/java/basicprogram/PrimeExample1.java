package com.chicho.java.basicprogram;

//Note: 0 and 1 are not prime numbers. The 2 is the only even prime number because all the other even numbers can be divided by 2.

public class PrimeExample1 {
	public static void main(String args[]) {
		int i, m = 0, flag = 0;
		int n = 3;// it is the number to be checked
		m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is prime number");
			}
		} // end of else
	}
}