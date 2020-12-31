package programming;

import java.util.Scanner;

public class Assignment2_3 {
	public static void main(String[] args) {
		System.out.println("enter n");
		int n=(new Scanner(System.in)).nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print((i+j)+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print((i*j));
				if(i%2==1 && j<n) {
					System.out.print("*");
				}
				if(i%2==0 && j<n) {
					System.out.print("#");
				}
			}
			System.out.println();
		}
		System.out.println();
		
/*		01 02 03 04 05 06 07 
		08 09          10 11 
		12    13    14    15 
		16       17       18 
		19    20    21    22 
		23 24          25 26 
		27 28 29 30 31 32 33 
*/		int c=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1 || j==0 || j== n-1 || i==j || i+j==n-1) {
					if(c<10) {
						System.out.print(0);
					}
					System.out.print(c++ +" ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
