package programming;

import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		System.out.println("enter n");
		int n=(new Scanner(System.in)).nextInt();
		
/*		4 3 2 1 
		4 3 2 1 
		4 3 2 1 
		4 3 2 1
*/
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(n-j+" ");
			}
			System.out.println();
		}
		System.out.println();
		
/*		4 4 4 4 
		3 3 3 3 
		2 2 2 2 
		1 1 1 1		
*/		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(n-i+" ");
			}
			System.out.println();
		}
		System.out.println();
		
/*		4 
		3 3 
		2 2 2 
		1 1 1 1	
*/		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(n-i+" ");
			}
			System.out.println();
		}
		System.out.println();
		
/*		4 1 1 1 1 
		3 3 2 2 2 
		2 2 2 3 3 
		1 1 1 1 4 		
*/		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(n-i+" ");
				}
			for(int j=0;j<n-i;j++) {
				System.out.print(i+1+" ");
				}
			System.out.println();
			}
		System.out.println();
		
/*			1 
		   2 3 
		  4 5 6 
		 7 8 9 10 
*/
		int c=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(c++ +" ");
			}
			System.out.println();
		}
		
	}

}
