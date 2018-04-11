package com.chicho.springs.setterdependencyinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Employee2Driver {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("com/chicho/springs/setterdependencyinjection/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		Employee2 e2 = (Employee2) factory.getBean("emp2");
		e2.displayInfo();
	}
}