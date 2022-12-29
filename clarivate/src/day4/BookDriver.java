package day4;

public class BookDriver {
public static void main(String[] args) {
	Book b1=new Book();
	Book b2=new Book();
	Book b3=new Book();
	b1.setDetails(50, 60, "green", 25);
	b2.setDetails(70, 80, "red", 20);
	b3.setDetails(45, 60, "orange", 30);
	b1.bookDetails();
	b2.bookDetails();
	b3.bookDetails();
}
}
