package day3;

public class MethodOverloading {
public static void main(String[] args) {
	int n=2,a=3;String s="prct";
	add(n,a);
	add(s);
	
}
public static void add() {
	System.out.println("no args");
}
public static void add(int a,int b) {
	System.out.println("2 int args");
}
public static void add(String s) {
	System.out.println("String args");
}
}
