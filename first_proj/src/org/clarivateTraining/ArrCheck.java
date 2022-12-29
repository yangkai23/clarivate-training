package org.clarivateTraining;
import java.util.Arrays;
public class ArrCheck {
public static void main(String[] args) {
	int ar[]=new int[5];
	ar[0]=6;
	ar[1]=1;
	ar[2]=3;
	ar[3]=4;
	ar[4]=5;
	System.out.println(Arrays.toString(ar));
	Arrays.fill(ar, 1, 4, 5);
	System.out.println(Arrays.toString(ar));
}
}
