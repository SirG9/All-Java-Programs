package com.chicho.springs.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/chicho/springs/applicationcontext/spring_anyname.xml");
		StudentBean student = (StudentBean) ac.getBean("studentbean");

		student.displayInfo();
	}
}