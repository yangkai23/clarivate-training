package Xam;

import java.util.Scanner;

public class CoinGame {
	public static int percentage(int n,int max,char[] outcome) {
		int k=0;
		int count=0;int i=0;
		for(i=0;i<outcome.length;i++) {
			if(outcome[i]=='H') {
					k=i;
					count++;
			}
		}
		double perc=(double)count/(k+1);
		double p=perc*100;
		return (int)p;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int max=sc.nextInt();
		char c[]=new char[n];
		for (int i = 0; i < c.length; i++) {
			c[i]=sc.next().charAt(0);
		}
		System.out.println(percentage(n, max, c));
		sc.close();
	}
}
