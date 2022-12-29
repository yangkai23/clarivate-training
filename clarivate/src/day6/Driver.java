package day6;

public class Driver {
public static void main(String[] args) {
	IBook i=new ClassMateImpl();
	i.read();
	i.pillow();
	Dairy d=new ClassMateImpl();
	d.notes();
}
}
