package programming;

import java.util.Scanner;

public class Assignment2_1 {
	public static void main(String[] args) {
		System.out.println("enter n");
		int n=(new Scanner(System.in)).nextInt();
		int c=1;

/*			1 
		   2 3 
		  4   6 
		 7     10 
		11       15
*/
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				if(j==0 || i==j) {
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
		
/* 		    1         
		   1 1       
		  1   1     
		 1     1   
		  1   1     
		   1 1       
		    1  		
*/
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-2;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<n;j++) {
				if(j==0 || j==i) {
					System.out.print("1 ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for(int i=0;i<n-2;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<n;j++) {
				if(j==0 || i+j==n-3) {
					System.out.print("1 ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println();

/*		1   2
		 3 4 
		  5  
		 6 7 
		8   9
*/		
		c=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j || i+j==n-1) {
				System.out.print(c++);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();

/*		01 02 03 04 05 
		 06 07 08 09 
		  10 11 12 
		   13 14 
		    15 
		    15 
		   14 13 
		  12 11 10 
		 09 08 07 06 
		05 04 03 02 01 
*/		
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
		c=n*(n+1)/2;
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
		
	}

}
