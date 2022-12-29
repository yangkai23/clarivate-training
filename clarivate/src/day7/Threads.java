package day7;

public class Threads {
	public static void display() throws InterruptedException {
		for(int i=65;i<=75;i++) {
			System.out.println((char)i);
			Thread.sleep(2000);
		}
	}
public static void main(String[] args) {
	try {
		display();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
}
