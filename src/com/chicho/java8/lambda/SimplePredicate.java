package com.chicho.java8.lambda;

import java.util.function.Predicate;

public class SimplePredicate {

	public static void main(String[] args) {
		//creation of predicate
		Predicate<Integer> lesserThan = i -> (i < 18);
		
		//calling predicate method
		System.out.println(lesserThan.test(20));
	}

}
