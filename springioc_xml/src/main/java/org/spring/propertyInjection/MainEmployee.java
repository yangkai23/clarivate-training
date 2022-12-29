package org.spring.propertyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmployee {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("employeeconfig.xml");
		Employee employee=applicationContext.getBean("emp",Employee.class);
		System.out.println("Name : "+employee.getName());
		System.out.println("Age : "+employee.getAge());
		System.out.println("Address : "+employee.getAddress());
	}
}
