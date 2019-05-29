package com.chicho.java.numbers;

public class Last4Digit {

	public static void main(String[] args) {
		String cardNumber = "1234567890123456";
		String last4Digits = cardNumber != null ? cardNumber.subSequence(cardNumber.length() >= 4 ? cardNumber.length() - 4 : 0, cardNumber.length()).toString():null;
		System.out.println("Last4Digit: "+last4Digits);
		
		System.out.println("Bin Number: "+cardNumber.substring(0,6));
		
//		For Example, for sequence "abc" we have
//		substring: a, ab, abc, b, bc, b and the empty substring. (n(n+1)/2) 
//		subsequence: a, b, c, ab, bc, ac, abc and the empty subsequence. ((2^n)-1)
	}

}
