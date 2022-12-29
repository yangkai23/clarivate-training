package org.clarivateTraining;

import java.util.*;

public class EmployeeDriver {
public static void main(String[] args) {
	TreeSet<Employee> ts=new TreeSet<>();
	ts.add(new Employee((double)45000, "anirudh"));
	ts.add(new Employee((double)30000, "hrushi"));
	ts.add(new Employee((double)100000, "revanth"));
	for(Employee e:ts)
		System.out.println(e.getName());
}
}
