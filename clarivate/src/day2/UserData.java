package day2;
import java.util.Scanner;
public class UserData {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		System.out.println("user name is "+sc.nextLine());
		System.out.println("enter age");
		System.out.println("user age is "+sc.nextInt());
		System.out.println("enter gender");
		System.out.println("user gender is "+sc.next().charAt(0));
		sc.close();
	}
}
