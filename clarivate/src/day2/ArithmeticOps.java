package day2;
import java.util.Scanner;
public class ArithmeticOps {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("1-Addition\n2-Subtraction\n3-product\n4-division");
		int c=sc.nextInt();
		switch (c) {
		case 1:
			System.out.println("addition of "+a +" and "+b+" is "+(a+b));
			break;
		case 2:
			System.out.println("subtraction of "+a +" and "+b+" is "+(a-b));
			break;
		case 3:
			System.out.println("product of "+a +" and "+b+" is "+(a*b));
			break;
		case 4:
			System.out.println("division of "+a +" and "+b+" is "+(a/b));
			break;
		default:
			break;
		}
		sc.close();
	}
}