package day2;

public class NestedIf {
public static void main(String[] args) {
	int id=2399;
	int passcode=6833;
	if(id==2399) {
		if(passcode==6833)
			System.out.println("Login successfull");
		else
			System.out.println("Incorrect password");
	}
	else
		System.out.println("invalid id");
}
}
