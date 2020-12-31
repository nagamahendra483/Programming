package programming;

import java.util.Scanner;

public class Assignment1_1 {
	public static void main(String[] args) {
		System.out.println("enter n value");
		int n=(new Scanner(System.in)).nextInt();
		
/*		01 10 18 25 31 36 40 43 45 
		02 11 19 26 32 37 41 44 
		03 12 20 27 33 38 42 
		04 13 21 28 34 39 
		05 14 22 29 35 
		06 15 23 30 
		07 16 24 
		08 17 
		09 
*/		for(int i=1;i<=n;i++) {
			int c=n,d=i;
			for(int j=0;j<=n-i;j++) {
				if(d<=9){
					System.out.print(0);
				}
				System.out.print(d+" ");
				d=d+c;
				c--;
			}
			System.out.println();
		}
	int count=1,c=n*n+1,k=n-1;
	for(int i=0;i<n;i++) {
		for(int j=0;j<i;j++) {
			System.out.print("   ");
		}
		for(int j=0;j<n-i;j++) {
			if(count<=9) {
				System.out.print(0);
			}
			System.out.print(count++ +"*");
		}
		for(int j=0;j<n-i;j++) {
			if(c<=9) {
				System.out.print(0);
			}
			System.out.print(c+j);
			if(j<n-i-1) {
				System.out.print("*");
			}
		}
		c=c-k;
		k--;
		System.out.println();
	}
	count=1;
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			System.out.print(count+j+" ");
		}
		System.out.println();
		if(n%2 == 1 && i==n/2) {
			count =count-n;
		}
		else if(n%2 ==0 && i==n/2-1) {
			count =count+n;
		}
		else if(i<n/2) {
			count =count+2*n;
		}
		else  {
			count =count-2*n;
		}
	}

	}

}
