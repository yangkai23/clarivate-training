package day4;

public class Duster {
	int size;
	double weight;
	String color;
	String shape;
	public Duster(int size, double weight, String color, String shape) {
		this.size = size;
		this.weight = weight;
		this.color = color;
		this.shape = shape;
	}
	public Duster(int size) {
		this.size=size;
	}
	public Duster(int size,String color) {
		this.size=size;
		this.color=color;
	}
	public void dusterDetails() {
		System.out.println(size+"\n"+weight+"\n"+color+"\n"+shape);
	}
	
	@Override
	public String toString() {
		return "Duster [size=" + size + ", weight=" + weight + ", color=" + color + ", shape=" + shape + "]";
	}
	public static void main(String[] args) {
		Duster d1=new Duster(10, 100, "red", "cuboid");
		Duster d2=new Duster(15, "black") {
			public String toString() {
				
				return "Duster [size=" + size +  ", color=" + color  + "]";
			}
		};
//		d1.dusterDetails();
		System.out.println(d1);
		System.out.println(d2);
	}
}
