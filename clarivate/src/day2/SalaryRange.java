package day2;

public class SalaryRange {
public static void main(String[] args) {
	int s=50000;
	if(s>=50000&&s<=100000)
		System.out.println("manager's salary");
	else if(s>=25000&&s<50000)
		System.out.println("employee salary");
	else if(s>=10000&&s<25000)
		System.out.println("co-Emp salary");
	else if(s>=0&&s<10000)
		System.out.println("heplers salary");
}
}
