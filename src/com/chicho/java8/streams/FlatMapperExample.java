package com.chicho.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.apache.log4j.net.SyslogAppender;

public class FlatMapperExample {

	public static void main(String[] args) {
		List<User> users = Arrays.asList(new User("Sandip", 27, Arrays.asList("1", "2")),
				new User("Amreen", 24, Arrays.asList("3", "4", "5")), new User("Vinay", 28, Arrays.asList("6", "2")),
				new User("Rahim", 35, Arrays.asList("7", "8")), new User("Madhuri", 30, Arrays.asList("9")));

		System.out.println("Functional Style: ");

		Optional<String> stringOptional = users.stream().map(user -> user.getPhoneNumbers().stream())
				.flatMap(stringStream -> stringStream.filter(phoneNo -> phoneNo.equals("5"))).findAny();

		stringOptional.ifPresent(System.out::println);

		//FlatMap converts one type of Stream into Another Stream
		// Optional can be used for null check, it is just like a Wrapper Class

	}

	private static Boolean isNotSandip(String name) {
		return !name.equals("Sandip");
	}

	static class User {
		private String name;
		private Integer age = 30;
		private List<String> phoneNumbers;

		public User(String name, Integer age, List<String> phoneNumbers) {
			super();
			this.name = name;
			this.age = age;
			this.phoneNumbers = phoneNumbers;
		}

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

		public List<String> getPhoneNumbers() {
			return phoneNumbers;
		}

		public void setPhoneNumbers(List<String> phoneNumbers) {
			this.phoneNumbers = phoneNumbers;
		}
	}
}
