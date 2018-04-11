package com.chicho.springs.factorymethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/*Let's see the simple code to inject the dependency by static factory method that returns the instance of another class.*/

public class Printable3FactoryDriver {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/chicho/springs/factorymethod/applicationContext2.xml");
		Printable2 p = (Printable2) context.getBean("p");
		p.print();
	}
}