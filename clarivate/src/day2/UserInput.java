package day2;
import java.util.Scanner;
public class UserInput {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println("integer data taken from user: "+n);
	double d=sc.nextDouble();
	System.out.println("double data taken from user: "+d);
	String s=sc.nextLine();
	System.out.println("String data taken from user: "+s);
	char c=sc.next().charAt(0);
	System.out.println("char data taken from user: "+c);
	byte b=sc.nextByte();
	System.out.println("byte data taken from user: "+b);
	short sh=sc.nextShort();
	System.out.println("short data taken from user: "+sh);
	long l=sc.nextLong();
	System.out.println("long data taken from user: "+l);
	sc.close();
}
}
