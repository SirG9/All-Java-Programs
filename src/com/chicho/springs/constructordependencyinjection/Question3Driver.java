package com.chicho.springs.constructordependencyinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Question3Driver {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("com/chicho/springs/constructordependencyinjection/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		Question3 q3 = (Question3) factory.getBean("q3");
		q3.displayInfo();

	}
}