package com.chicho.springs.factorymethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*Let's see the simple code to inject the dependency by static factory method.*/

public class A1Driver {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/chicho/springs/factorymethod/applicationContext1.xml");
		A1 a = (A1) context.getBean("a1");
		a.msg();
	}
}