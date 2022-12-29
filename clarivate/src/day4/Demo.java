package day4;

public class Demo {
	int a=2;
	public void run() {
		System.out.println("non-static method");
	}
	public static void main(String[] args) {
		Demo demo=new Demo();
		System.out.println(demo.a);
		demo.run();
	}
}
