package com.chicho.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NaturalsPeekSkip {

	public static void main(String[] args) {
		List<Integer> naturals = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
		naturals.stream().map(n -> n * 2).peek(System.out::println).collect(Collectors.toList());

		System.out.println(naturals);

		System.out.println();

		Stream.of("One", "Two", "Three").filter(obj -> !obj.equals("One")).peek(System.out::print)
				.collect(Collectors.toList());
		
		System.out.println();
		
		IntStream.of(1,23,4,5,6,7).skip(2).filter(i -> i > 5).forEach(i -> System.out.println(i));

	}

}
