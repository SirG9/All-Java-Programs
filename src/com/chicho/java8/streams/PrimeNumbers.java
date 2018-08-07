package com.chicho.java8.streams;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println(isPrimeTraditional(6));
		System.out.println(isPrimeDeclarative(7));
		System.out.println(isPrimeDeclarativeReadable(9));
	}

	private static boolean isPrimeTraditional(int number) {
		if (number < 2)
			return false;
		for (int i = 2; i < number; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	private static boolean isPrimeDeclarative(int number) {
		return number > 1 && IntStream.range(2, number).noneMatch(p -> number % p == 0);
	}

	private static boolean isPrimeDeclarativeReadable(int number) {
		IntPredicate isDivisible = p -> number % p == 0;
		return number > 1 && IntStream.range(2, number).noneMatch(isDivisible);
	}
}
