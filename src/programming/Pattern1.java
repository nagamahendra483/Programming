package programming;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter n");
		int n=sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");			
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if((i<=n/2 && i<=j && i+j<=n-1) || (i>=n/2 && i+j>=n-1 && i>=j) )
				{
					System.out.print("*");	
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.print(" ");
			
			for (int j = 0; j < n; j++) {
				if(i==0 || i==n-1 || (j<=n/2 && i>=j && i+j<=n-1 ) || (j>=n/2 && i<=j && i+j>=n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
					
			}
			
			System.out.print(" ");
			
			for (int j = 0; j < n; j++) {
				if(i==0 || i==n-1 || j==0 || j==n-1 || i==n/2 || j==n/2) {
				System.out.print("*");	
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.print(" ");
			
			for (int j = 0; j < n; j++) {
				if(i==0 || i==n-1 || (j<=n/2 && i>=j && i+j<=n-1 ) || (j>=n/2 && i<=j && i+j>=n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
					
			}
			
			System.out.print(" ");
			
			
			for (int j = 0; j < n; j++) {
				if((i<=n/2 && i<=j && i+j<=n-1) || (i>=n/2 && i+j>=n-1 && i>=j) )
				{
					System.out.print("*");	
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.print(" ");
			
			
			for (int j = 0; j < n; j++) {
				System.out.print("*");			
			}
			
			System.out.print(" ");
			
			
			for (int j = 0; j < n; j++) {
				if(i==j || i==n-1) {
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

