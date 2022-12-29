package day2;
import java.util.Scanner;
public class Even {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	while(a<=b) {
		if(a%2==0)
			System.out.println(a);
		a++;
	}
	
	sc.close();
}
}