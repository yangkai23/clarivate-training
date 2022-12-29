package day2;

public class Matrimony {
	public static void main(String[] args) {
		char c='f';
		int age=22;
		if(c=='m') {
			if(age>=21)
				System.out.println("Eligible for marriage");
			else
				System.out.println("Have patience");
		}
		else if(c=='f') {
			if(age>=18)
				System.out.println("Eligible for marriage");
			else
				System.out.println("Have patience");
		}

	}

}
