package com.chicho.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MapperInt2 {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println("Sum::" + sumWithCondition(numberList, n -> true));
		System.out.println("Sum::" + sumWithCondition(numberList, i -> i % 2 == 0));
		System.out.println("Sum::" + sumWithCondition(numberList, i -> i > 5));

		System.out.println(findSquareOfMaxOdd(numberList));
		System.out.println(findSquareOfMaxOddUsingStreamAPI(numberList));
	}

	public static int sumWithCondition(List<Integer> numbers, Predicate<Integer> predicate) {
		return numbers.parallelStream().filter(predicate).mapToInt(i -> i).sum();
	}

	private static int findSquareOfMaxOdd(List<Integer> numbers) {
		int max = 0;
		for (int i : numbers) {
			if (i % 2 != 0 && i >= 3 && i < 11 && i > max) {
				max = i;
			}
		}
		return max * max;
	}

	private static int findSquareOfMaxOddUsingStreamAPI(List<Integer> numbers) {
		return numbers.stream().filter(MapperInt2::isOdd).filter(MapperInt2::isGTEQ3).filter(MapperInt2::isLT11)
				.max(Comparator.naturalOrder()).map(i -> i * i).get();
	}

	public static boolean isOdd(int i) {
		return i % 2 != 0;
	}

	public static boolean isGTEQ3(int i) {
		return i > 3;
	}

	public static boolean isLT11(int i) {
		return i < 11;
	}
}
