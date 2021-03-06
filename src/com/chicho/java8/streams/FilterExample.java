package com.chicho.java8.streams;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sandip", "Amreen", "Vinay", "Rahim", "Madhuri");

		names.stream().filter(name -> isNotSandip(name)).forEach(name -> System.out.println(name));
		// Filter takes predicates and ForEach takes Consumer
		names.stream().filter(name -> isNotSandip(name)).forEach(System.out::println);
	}

	private static Boolean isNotSandip(String name) {
		return !name.equals("Sandip");
	}

}
