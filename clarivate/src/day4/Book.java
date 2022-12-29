package day4;

public class Book {
int pages;
long price;
String color;
int size;
public void setDetails(int pages, long price, String color, int size) {
	this.pages = pages;
	this.price = price;
	this.color = color;
	this.size = size;
}
public void bookDetails() {
	System.out.println(this.color+" "+this.pages+" "+this.price+" "+this.size);
}
}
