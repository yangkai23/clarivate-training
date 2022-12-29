package day2;

public class SwitchSt {
	public static void main(String[] args) {
		int n=2;
		int a=9,b=5;
		switch (n) {
		case 1: {
			System.out.println("addition is "+(a+b));	
			break;
		}
		case 2: {
			System.out.println("subtraction is "+(a-b));	
			break;
		}
		case 3: {
			System.out.println("product  is "+(a*b));	
			break;
		}
		case 4: {
			System.out.println("division is "+(double)(a/b));	
			break;
		}
		default:
			System.out.println("Done and dusted");
		}
	}
}
