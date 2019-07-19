package com.chicho.java8.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamCreation {

	public static void main(String[] args) {
		
		//Empty Stream Creation
		Stream<String> streamEmpty = Stream.empty();

		//Stream of collection
		Collection<String> collection = Arrays.asList("a", "b", "c");
		Stream<String> streamOfCollection = collection.stream();
		
		//Stream of Array
		Stream<String> streamOfArray = Stream.of("a", "b", "c");
		String[] arr = new String[]{"a", "b", "c"};
		Stream<String> streamOfArrayFull = Arrays.stream(arr);
		Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3); //index 1, 2 will be included, and not 3
		List<String> list = streamOfArrayPart.collect(Collectors.toList());
		for(String s:list) {
			System.out.println(s);	
		}
		
		//Stream Builder
		Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").add("c").build();
		
		//Stream Generate
		Stream<String> streamGenerated = Stream.generate(() -> "element").limit(10); //list<String> will not extend than the specified size, i.e., 10
		System.out.println(streamGenerated.collect(Collectors.toList()));
		
		//Stream iterate
		Stream<Integer> StreamIterated = Stream.iterate(40, n -> n + 2).limit(20);
		
		//Stream of Primitives
		IntStream intStream = IntStream.range(1, 3); //range(int startInclusive, int endExclusive)
		LongStream longStream = LongStream.rangeClosed(1, 3); //rangeClosed(int startInclusive, int endInclusive)
		Random random = new Random();
		DoubleStream doubleStream = random.doubles(3);
		
	}

}
