package com.chicho.springs.dependencyinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Question4Driver {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("com/chicho/springs/dependencyinjection/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		Question4 q4 = (Question4) factory.getBean("q4");
		q4.displayInfo();

	}
}