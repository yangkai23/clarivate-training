package org.spring.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStudentTeacher {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("teacherstudent.xml");
	Student student=context.getBean("student",Student.class);
	System.out.println(student.getId());
	System.out.println(student.getName());
	Teacher teacher=student.getTeacher();
	System.out.println(teacher.getName());
	System.out.println(teacher.getSchool());
}
}
