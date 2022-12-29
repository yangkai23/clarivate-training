package org.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStudent {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("items.xml");
		Student student=context.getBean("student",Student.class);
		student.iseItems();
	}
}
