package com.chicho.springs.aop.throwsadvice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("com/chicho/springs/aop/throwsadvice/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		Validator v = factory.getBean("proxy", Validator.class);
		try {
			v.validate(12);// Not Valid Age
			// v.validate(19);// Vote Confirmed
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}