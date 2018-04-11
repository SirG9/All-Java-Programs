package com.chicho.springs.constructordependencyinjection;

import java.util.Date;

public class Answer4 {
	private int id;
	private String answer;
	private Date postedDate;

	public Answer4() {
	}

	public Answer4(int id, String answer, Date postedDate) {
		super();
		this.id = id;
		this.answer = answer;
		this.postedDate = postedDate;
	}

	public String toString() {
		return "Id:" + id + " Answer:" + answer + " Posted Date:" + postedDate;
	}
}
