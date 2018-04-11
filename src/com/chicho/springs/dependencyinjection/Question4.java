package com.chicho.springs.dependencyinjection;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question4 {
	private int id;
	private String name;
	private Map<Answer4, User4> answers;

	public Question4() {
	}

	public Question4(int id, String name, Map<Answer4, User4> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}

	public void displayInfo() {
		System.out.println("question id:" + id);
		System.out.println("question name:" + name);
		System.out.println("Answers....");
		Set<Entry<Answer4, User4>> set = answers.entrySet();
		Iterator<Entry<Answer4, User4>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<Answer4, User4> entry = itr.next();
			Answer4 ans = entry.getKey();
			User4 user = entry.getValue();
			System.out.println("Answer Information:");
			System.out.println(ans);
			System.out.println("Posted By:");
			System.out.println(user);
		}
	}
}
