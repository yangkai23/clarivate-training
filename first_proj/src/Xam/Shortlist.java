package Xam;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
public class Shortlist {
	public static int equalizeArray(int n,int[] a) {
		HashMap<Integer, Integer> hs=new HashMap<>();
		for(int i=0;i<a.length;i++) {
			if(!hs.containsKey(a[i])) {
				hs.put(a[i], 1);
			}
			else {
				hs.put(a[i], hs.get(a[i])+1);
			}
		}
		System.out.println(hs);
		int max=0;
		for(Entry<Integer, Integer> e:hs.entrySet()) {
			if(e.getValue()>max) {
				max=e.getValue();
			}
		}
		return a.length-max;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(equalizeArray(n, arr));
		sc.close();
	}
}
