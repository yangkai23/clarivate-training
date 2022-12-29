package Xam;

import java.util.Scanner;

public class NestedLoop {
	public static int numOfWays(int n,int[ ] arr,int total){
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==total)
					count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int total=sc.nextInt();
		System.out.println(numOfWays(n, arr, total));
		sc.close();
	}
}
