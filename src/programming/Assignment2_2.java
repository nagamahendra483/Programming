package programming;

import java.util.Scanner;

public class Assignment2_2 {
	public static void main(String[] args) {
		System.out.println("enter n");
		int n=(new Scanner(System.in)).nextInt();
		
/*			15 
		   14 13 
		  12 11 10 
		 09 08 07 06 
		05 04 03 02 01 
		01 02 03 04 05 
		 06 07 08 09 
		  10 11 12 
		   13 14 
		    15 		
*/		
		int c=n*(n+1)/2;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				if(c<10) {
					System.out.print(0);
				}
				System.out.print(c-- +" ");
			}
			System.out.println();
		}
		c=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<n-i;j++) {
				if(c<10) {
					System.out.print(0);
				}
				System.out.print(c++ +" ");
			}
			System.out.println();
		}
		System.out.println();
		
/*			 1 
		    2 3 
		   4   6 
		  7     10 
		 11 12 13 14 15 
*/		
		c=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				if(j==0 || j==i || i==n-1) {
					System.out.print(c++ +" ");
				}
				else {
					System.out.print("  ");
					c++;
				}
			}
			System.out.println();
		}
		System.out.println();
		
/*			01 
		   03 02 
		  06 05 04 
		 10 09 08 07 
		15 14 13 12 11 
*/		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			c=i*(i+1)/2;
			for(int j=1;j<=i;j++) {
				if(c<10) {
					System.out.print(0);
				}
				System.out.print(c-- +" ");
			}
			
			System.out.println();
		}
		System.out.println();

/*		2 
		4 6 
		8  10 
		12   14 
		16 18 20 22 24 		
*/		
		c=2;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				if(j==0 || i==j || i==n-1) {
					System.out.print(c+" ");
					c=c+2;
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
