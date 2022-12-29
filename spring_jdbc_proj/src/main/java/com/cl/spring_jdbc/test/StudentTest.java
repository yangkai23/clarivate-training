package com.cl.spring_jdbc.test;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cl.spring_jdbc.configuration.StudentConfig;
import com.cl.spring_jdbc.dao.StudentDao;
import com.cl.spring_jdbc.dto.Student;

public class StudentTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		StudentDao dao = context.getBean("studentDao", StudentDao.class);
		Scanner sc=new Scanner(System.in);
		int x=-1;
		while (x != 0) {
			System.out.println(
					"1-SaveStudent\n2-UpdateStudent\n3-DeleteStudent\n4-Display AllStudents\n5-Display Student by ID\n6-terminate");
			System.out.println("Enter response");
			x = sc.nextInt();
			switch (x) {
			case 1:
				Student student = context.getBean("student", Student.class);
				System.out.println("Enter student Id");
				student.setId(sc.nextInt());
				System.out.println("Enter student name");
				student.setName(sc.next());
				System.out.println("Enter student Phone Number");
				student.setPhone(sc.nextLong());
				System.out.println("Enter Student school name");
				student.setSchool(sc.next());
				System.out.println("Enter Student Fee");
				student.setFees(sc.nextDouble());
				dao.saveStudent(student);
				System.out.println("student saved successfully");
				break;
			case 2:
				Student std = context.getBean("student", Student.class);
				System.out.println("Enter Student Id ");
				std.setId(sc.nextInt());
				System.out.println("Enter Student Name");
				std.setName(sc.next());
				System.out.println("Enter Student phone");
				std.setPhone(sc.nextLong());
				System.out.println("Enter Student Fee");
				std.setFees(sc.nextDouble());
				dao.updateStudent(std);
				System.out.println("student Updated successfully");
				break;
			case 3:
				System.out.println("enter the Student id to delete");
				dao.deleteStudent(sc.nextInt());
				System.out.println("student Deleted successfully");
				break;
			case 4:
				List<Map<String, Object>> students = dao.getAllStudents();
				for (Map<String, Object> stud : students) {
					System.out.println("Student ID : " + stud.get("id"));
					System.out.println("Student Name : " + stud.get("name"));
					System.out.println("Student School : " + stud.get("school"));
					System.out.println("Student Phone : " + stud.get("phone"));
					System.out.println("Student Fee : " + stud.get("fees"));
					System.out.println("--------------------------------------");
				}
				break;
			case 5:
				System.out.println("enter Id of Student");
				dao.getStudentById(sc.nextInt());
				break;
			case 6:
				x = 0;
				break;
			default:
				System.out.println("Select valid Operation");
				break;
			}
			System.out.println("terminate-0\nrepeat-Any number");
			x = sc.nextInt();
		}
		System.out.println("terminated");
	}

}
