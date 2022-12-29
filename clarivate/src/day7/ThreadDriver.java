package day7;

public class ThreadDriver {
public static void main(String[] args) {
	RunnableThread rt=new RunnableThread();
	Thread t=new Thread(rt);
System.out.println(t.getId());
System.out.println(t.getName());
	t.start();
}
}
