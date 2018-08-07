package com.chicho.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++)
			myList.add(i);

		// sequential stream
		Stream<Integer> sequentialStream = myList.stream();

		// parallel stream //these are not in order
		Stream<Integer> parallelStream = myList.parallelStream();

		Stream<Integer> highNums = parallelStream.filter(p -> p > 90);
		highNums.forEach(p -> System.out.println("High Nums Parallel::" + p));

		Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
		highNumsSeq.forEach(p -> System.out.println("High Nums Sequential::" + p));
	}

}
