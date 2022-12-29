package day7;

public class MyThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Demo");
	}
	public static void main(String[] args) throws InterruptedException {
		Runnable r=new MyThread();
		Thread t=new Thread(r,"Custom Thread");
		t.start();
		Thread.sleep(3000);
		System.out.println(t.getName());
	}
}
