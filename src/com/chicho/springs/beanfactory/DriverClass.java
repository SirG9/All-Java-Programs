package com.chicho.springs.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DriverClass {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("com/chicho/springs/beanfactory/spring_anyname.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		StudentBean student = (StudentBean) factory.getBean("studentbean");
		student.displayInfo();
	}
}