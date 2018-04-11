package com.chicho.springs.setterdependencyinjection;

public class User4 {
	private int id;
	private String name, email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

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