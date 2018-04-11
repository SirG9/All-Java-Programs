package com.chicho.springs.constructordependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDriver {
	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"com/chicho/springs/constructordependencyinjection/applicationContext.xml");

		Employee emp = (Employee) ac.getBean("e");
		emp.show();

	}
}