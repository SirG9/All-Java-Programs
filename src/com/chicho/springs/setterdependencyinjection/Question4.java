package com.chicho.springs.setterdependencyinjection;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question4 {
	private int id;
	private String name;
	private Map<Answer4, User4> answers;

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

	public Map<Answer4, User4> getAnswers() {
		return answers;
	}

	public void setAnswers(Map<Answer4, User4> answers) {
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
