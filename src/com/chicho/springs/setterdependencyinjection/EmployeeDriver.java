package com.chicho.springs.setterdependencyinjection;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  
  
public class EmployeeDriver {  
    public static void main(String[] args) {  
          
        Resource r=new ClassPathResource("com/chicho/springs/setterdependencyinjection/applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
        Employee e=(Employee)factory.getBean("emp");  
        e.display();  
          
    }  
}