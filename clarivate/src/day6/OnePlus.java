package day6;

public class OnePlus extends Mobile {
	@Override
	public void specs() {
			System.out.println("Specs of OnePlus:");
	}
	public static void main(String[] args) {
		Mobile m=new OnePlus();
		m.specs();
		m.call();
	}
}

