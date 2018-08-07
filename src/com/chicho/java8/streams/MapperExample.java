package com.chicho.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapperExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sandip", "Amreen", "Vinay", "Rahim", "Madhuri");

		names.stream().filter(name -> isNotSandip(name)).map(name -> new User(name))
				.forEach(anything -> System.out.println(anything));
		
		List<User> userList = names.stream().filter(name -> isNotSandip(name)).map(name -> new User(name))
		.collect(Collectors.toList());
	}

	private static Boolean isNotSandip(String name) {
		return !name.equals("Sandip");
	}

	static class User {
		private String name;
		private Integer age = 30;

		public User(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "name : " + name + " age : " + age;
		}
	}
}
