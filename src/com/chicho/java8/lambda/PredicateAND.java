package com.chicho.java8.lambda;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateAND {

	public static void main(String[] args) {
		String nullString = null;
		String lengthGtThan10 = "Welcome to Java";

		Predicate<String> notNullPredicate = Objects::nonNull;
		boolean outcome = notNullPredicate.and(hasLengthof10).test(nullString);
		System.out.println(outcome);
		
		outcome = notNullPredicate.and(hasLengthof10).test(lengthGtThan10);
		System.out.println(outcome);
	}

	public static Predicate<String> hasLengthof10 = new Predicate<String>() {

		@Override
		public boolean test(String t) {
			return t.length() > 10;
		}
	};

}
