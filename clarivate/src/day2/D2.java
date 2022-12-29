package day2;
public class D2 {
	public static void main(String[] args) {
		int num1=10;
		int num2=9;
		int num3=8;
		int num4=160;
		int num5=940;
		if(num1>num2 && num1>num3 && num1>num4 && num1>num5)
			System.out.println(num1+" is greater");
		else if(num2>num1 && num2>num3 && num2>num4 && num2>num5)
			System.out.println(num2+" is greater");
		else if(num3>num1 && num3>num2 && num3>num4 && num3>num5)
			System.out.println(num3+" is greater");
		else if(num4>num1 && num4>num2 && num4>num3 && num4>num5)
			System.out.println(num4+" is greater");
		else
			System.out.println(num5+" is greater");
	}
}