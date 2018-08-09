package com.chicho.java8.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) throws IOException {
		List<String> stringList = Files
				.lines(Paths.get("C:/Users/CH318977/git/All-Java-Programs/src/com/chicho/java8/streams/POM.xml"))
				.filter(line -> line.trim().contains("name"))
				.map(line -> line.replaceAll("name", "").replaceAll("<", "").replaceAll(">", "").replaceAll("/", ""))
				.collect(Collectors.toList());

		System.out.println(stringList);
	}
}
