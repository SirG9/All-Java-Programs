package com.chicho.springs.dependencyinjection;

public class User4 {
	private int id;
	private String name, email;

	public User4() {
	}

	public User4(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public String toString() {
		return "Id:" + id + " Name:" + name + " Email Id:" + email;
	}
}
