package com.chicho.java8.lambda;

import java.util.function.Predicate;

public class PredicateInFunction {

	public static void main(String[] args) {
		pred(10, i -> i > 7);
	}

	private static void pred(int i, Predicate<Integer> pred) {
		if(pred.test(i)) {
			System.out.println("Number: "+i);
		}
	}

}
