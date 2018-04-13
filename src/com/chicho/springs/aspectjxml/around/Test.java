package com.chicho.springs.aspectjxml.around;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/chicho/springs/aspectjxml/around/applicationContext.xml");

		Operation op = (Operation) context.getBean("opBean");
		op.msg();
		op.display();
	}
}