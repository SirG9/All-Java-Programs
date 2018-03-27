package com.chicho.java.comparable;

public class Student implements Comparable<Student> {
	int rollno;
	String name;
	int age;

	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	//Following method is for comparing int type
	/*@Override
	public int compareTo(Student st) {
		if (age > st.age)
			return 1;
		else if (age == st.age)
			return 0;
		else
			return -1;
	}*/
	
	//Following method is for comparing String Objects
	@Override
	public int compareTo(Student st) {
		if(name.compareTo(st.name) > 0)
			return 1;
		else if(name.compareTo(st.name) < 0)
			return -1;
		else
			return 0;
	}

}
