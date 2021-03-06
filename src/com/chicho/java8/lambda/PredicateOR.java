package com.chicho.java8.lambda;

import java.util.function.Predicate;

public class PredicateOR {

	public static void main(String[] args) {
		Predicate<String> containsLetterA = p -> p.contains("A");
		String containsA = "And";
		boolean outcome = hasLengthof10.or(containsLetterA).test(containsA);
		System.out.println(outcome);
	}
	
	public static Predicate<String> hasLengthof10 = new Predicate<String>() {
		
		@Override
		public boolean test(String t) {
			return t.length() > 10;
		}
	}; 
}
