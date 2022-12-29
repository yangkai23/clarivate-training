package day4;
public class EraserDriver {
	public static void main(String[] args) {
		Eraser e1=new Eraser();
		Eraser e2=new Eraser();
		Eraser e3=new Eraser();
		Eraser e4=new Eraser();
		e1.brand="cello";e1.color="white";e1.shape="circle";e1.size=2;
		e2.brand="Flair";e2.color="Red";e2.shape="Cuboid";e2.size=4;
		e3.brand="classmate";e3.color="green";e3.shape="Cube";e3.size=3;
		e4.brand="pbh";e4.color="blue";e4.shape="circle";e4.size=5;
		e1.EraserDetails();
		e2.EraserDetails();
		e3.EraserDetails();
		e4.EraserDetails();
	}
}