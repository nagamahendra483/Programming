package arrays;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		
		int res=search(sc.nextInt(),ar);
		if(res!=-1) {
			System.out.println("element found : "+res);
		}else {
			System.out.println("element not found");
		}
		

	}

	public static int search(int n, int[] ar) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]==n) {
				return i+1;
			}
		}
		return -1;
	}

	

}
