package day6;

public class ClassMateImpl extends Dairy implements IBook  {

	@Override
	public void read() {
		System.out.println("books can be read");
	}

	@Override
	public void pillow() {
System.out.println("book can be used as pillow");		
	}
	public void notes() {
		System.out.println("can be used for practice ");
	}
}
