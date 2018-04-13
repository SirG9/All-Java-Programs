package com.chicho.springs.aspectjxml.after;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.chicho.springs.aspectjxml.before.Operation;;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/chicho/springs/aspectjxml/after/applicationContext.xml");
		Operation e = (Operation) context.getBean("opBean");
		System.out.println("calling msg...");
		e.msg();
		System.out.println("calling m...");
		e.m();
		System.out.println("calling k...");
		e.k();
	}
}