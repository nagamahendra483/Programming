package programming;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter n");
		int n=sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n; j++) {
				if(i+j>n-1 || i==n-1) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for (int j = 0; j < n; j++) {
				if(i>j || i==n-1) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for (int j = 0; j < n; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i<j) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}					
			}
			for (int j = 0; j < n; j++) {
				if(i==j ||i==0 || j==0) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}					
			}
			for (int j = 0; j < n; j++) {
				if(i+j==n-1 || j==n-1 || i==0) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}					
			}
			for (int j = 0; j < n; j++) {
				if(i+j<n-1) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}					
			}
			for (int j = 0; j < n; j++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i+j>n-1 ||j==n-1) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}					
			}
			for (int j = 0; j < n; j++) {
				if(i+j==n-1 ||i==n-1|| j==0) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}					
			}
			for (int j = 0; j < n; j++) {
				if(i==j ||j==n-1 || i==n-1) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}					
			}
			for (int j = 0; j < n; j++) {
				if(i>j||i==n-1) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}					
			}
			for (int j = 0; j < n; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			System.out.print(" ");
			}
			for(int j=0;j<n;j++) {
				if(i<j) {
					System.out.print("*");
					}
					else {
						System.out.print(" ");
					}	
			}
			for(int j=0;j<n;j++) {
				if(i+j<n-1) {
					System.out.print("*");
					}
					else {
						System.out.print(" ");
					}	
			}
			for (int j = 0; j < n; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
