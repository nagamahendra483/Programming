package arrays;

import java.util.Scanner;

public class MaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		findMaxMin(ar);
		System.out.println("max no is "+MaxAndMin.max);
		System.out.println("min no is "+MaxAndMin.min);
		System.out.println("sum no is "+MaxAndMin.sum);
	}
	static int max;
	static int min;
	static int sum;

	public static void findMaxMin(int[] ar) {
		// TODO Auto-generated method stub
		 max = ar[0]; 
		 min = ar[0];
		 sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum += ar[i];
			if (ar[i] > max) {
				max = ar[i];
			} else if (ar[i] < min) {
				min = ar[i];
			}
		}
		

	}

}
