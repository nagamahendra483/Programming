package arrays;

import java.util.Scanner;

public class SequenceEquation {
	
	
	
	/*
	 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			int y=findElement(i+1,ar);
			System.out.println(findElement(y,ar));
		}

	}

	private static int findElement(int i,int[] ar) {
		// TODO Auto-generated method stub
		int k=Search.search(i, ar);
		return k;
	}

}
