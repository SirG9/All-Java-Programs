package com.chicho.springs.dependencyinjection;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question3 {
	private int id;
	private String name;
	private Map<String, String> answers;

	public Question3() {
	}

	public Question3(int id, String name, Map<String, String> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}

	public void displayInfo() {
		System.out.println("question id:" + id);
		System.out.println("question name:" + name);
		System.out.println("Answers....");
		Set<Entry<String, String>> set = answers.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<String, String> entry = itr.next();
			System.out.println("Answer: " + entry.getKey() + " Posted By: " + entry.getValue());
		}
	}
}
