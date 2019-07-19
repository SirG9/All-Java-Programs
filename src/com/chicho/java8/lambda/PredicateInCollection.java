package com.chicho.java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInCollection {

	public static void main(String[] args) {
		List<User> users = new ArrayList<User>();
		users.add(new User("Sandip", "Admin"));
		users.add(new User("Komal", "Member"));
		List<User> admins = process(users, (User u) -> u.getRole().equals("Admin"));
		System.out.println(admins);
	}

	static List<User> process(List<User> users, Predicate<User> pred) {
		List<User> result = new ArrayList<User>();
		for (User u : users) {
			if (pred.test(u)) {
				result.add(u);
			}
		}
		return result;
	}

	static class User {

		String name;
		String role;

		public User(String name, String role) {
			this.name = name;
			this.role = role;
		}

		String getName() {
			return name;
		}

		String getRole() {
			return role;
		}

		public String toString() {
			return "User Name: " + name + ", Role: " + role;

		}
	}
}
