package day3;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("addition is "+add(a,b));
		System.out.println("subtraction is "+subtract(a,b));
		System.out.println("div is "+div(a,b));
		System.out.println("product is "+product(a,b));
		sc.close();
	}

	public static int product(int a, int b) {
		return a*b;
	}

	public static double div(int a, int b) {
		return a/b;
	}

	public static int subtract(int a, int b) {
		return a-b;
	}

	public static int add(int a, int b) {
		return a+b;
	}
}
