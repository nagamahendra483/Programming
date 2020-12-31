package programming;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter n");
		int n=sc.nextInt();
		
		// 1st
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
			System.out.println();
		}
		// 2nd 
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n; j++) {
				if(j==n/2 && i<n/2 || i==j && i>=n/2 || i==n/4 && j==3*n/4 || j==n-1 && i==n/2) {
					if(i==n/4 && j==3*n/4 || j==n-1 && i==n/2) {
						System.out.print("@");
					}
					else {
						System.out.print("*");
					}
				}
				else {
					System.out.print(" ");
				}
			}
			for (int j = 0; j < n; j++) {
				if(j==n/2 && i<n/2 || i+j==n-1 && i>=n/2 || i==n/4 && j==n/4 || j==0 && i==n/2) {
					if( i==n/4 && j==n/4 || j==0 && i==n/2) {
						System.out.print("@");
					}
					else {
						System.out.print("*");
					}
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		// 3rd 
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j>n-1 && i+j<n+n/2-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++) {
				if(i==0 && j<3*n/4-1 || j==0 || j-i==n/2 && i<=n/2) {
				System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++) {
				if(i==0 && j>n/4+1||j==n-1 || i+j==n/2 && i<=n/2 ) {
				System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++) {
				if(i>j && i-j<n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		// 4th
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j>0 && j<n/2 && i<3*n/4) {
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++) {
				if(j==0 || i==n-1) {
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++) {
				if(j==n-1 || i==n-1) {
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++) {
				if(j>n/2 && j<n-1 && i<3*n/4) {
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		//5th
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j==n-1 || i==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++) {
				if(i==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++) {
				if( i==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++) {
				if(i==j || i==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		//6th
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<n;j++) {
				if(j>0 && j<n/2) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++) {
				if(j>n/2 && j<n-1) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
