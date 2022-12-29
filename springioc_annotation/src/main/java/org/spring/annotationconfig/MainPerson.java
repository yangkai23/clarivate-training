package org.spring.annotationconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPerson {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("person.xml");
		Person person=context.getBean("person",Person.class);
		person.walk();
		person.talk();
		System.out.println("ID : "+person.id+"\nName : "+person.name);
	}
}