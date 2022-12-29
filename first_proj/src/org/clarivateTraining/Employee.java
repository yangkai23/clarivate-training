package org.clarivateTraining;

public class Employee implements Comparable<Employee> {
	private double sal;
	private String name;
	
	public Employee(double sal, String name) {
		this.sal = sal;
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Employee e) {
		if(this.sal<e.sal)
		return -1;
		else if(this.sal>e.sal)
			return 1;
		return 0;
	}
}

