package day7;

public class DemoImpl{
	public void show() {
		System.out.println("implemented method in implementation class");
	}
public static void main(String[] args) {
//	DemoImpl dm=new DemoImpl();
//	Demo d=dm::show;
//	d.display();
	Demo d=()-> System.out.println("display");
	d.display();
}
}