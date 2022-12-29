package day3;

public class StaticMembers {
	static int a;
	public static void main(String[] args) {
		System.out.println(a);
		a=45;
		m1();
		System.out.println(a);
	}
	private static void m1() {
		System.out.println(a);
		a=76;
	}
}
