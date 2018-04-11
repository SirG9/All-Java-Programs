package com.chicho.springs.factorymethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*Let's see the example to inject the dependency by non-static factory method that returns the instance of another class.*/

public class Printable2FactoryDriver {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/chicho/springs/factorymethod/applicationContext3.xml");
		Printable2 p = (Printable2) context.getBean("p");
		p.print();
	}
}