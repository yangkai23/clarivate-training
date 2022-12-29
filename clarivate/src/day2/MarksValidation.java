package day2;

public class MarksValidation {
public static void main(String[] args) {
	int marks=72;
	if(marks>=81&&marks<=100)
		System.out.println("Distinction");
	else if(marks>=35&&marks<81)
		System.out.println("First class");
	else
		System.out.println(":(  Fail");
}
}
