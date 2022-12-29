package day4;

public class Employee {
	String emp_name;
	int emp_id;
	int emp_sal;
	public void employeeDetails() {
		System.out.println(this.emp_name+"\n"+this.emp_id+"\n"+this.emp_sal);
		System.out.println();
	}
public static void main(String[] args) {
	Employee e1=new Employee();
	Employee e2=new Employee();
	Employee e3=new Employee();
	e1.emp_name="Ani";e1.emp_id=23;e1.emp_sal=50000;
	e2.emp_name="Anirudh";e2.emp_id=33;e2.emp_sal=60000;
	e3.emp_name="Ani";e3.emp_id=25;e3.emp_sal=25000;
	e1.employeeDetails();
	e2.employeeDetails();
	e3.employeeDetails();
}
}
