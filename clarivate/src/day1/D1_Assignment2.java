package day1;

import java.util.Scanner;

public class D1_Assignment2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int b=sc.nextInt();
	String s=n%2==0?"even":"odd";
	System.out.println(n+" is an "+s+" number");
	String big=n>b?n+" is bigger":b+" is bigger";
	System.out.println(big);
	String small=n<b?n+" is smaller":b+" is smaller";
	System.out.println(small);
	sc.close();
}
}
