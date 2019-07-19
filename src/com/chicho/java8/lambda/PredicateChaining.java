package com.chicho.java8.lambda;

import java.util.function.Predicate;

public class PredicateChaining {

	public static void main(String[] args) {
		Predicate<Integer> greaterThanTen = i -> (i > 10);
		Predicate<Integer> lowerThanTwenty = i -> (i < 20);
		Boolean result = greaterThanTen.and(lowerThanTwenty).test(15); // 15 > 10 && 15 < 20;
		System.out.println(result);
		Boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15); // 15 > 10 && 15 < 20;
		System.out.println(result2);
	}

}
