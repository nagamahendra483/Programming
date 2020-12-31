package programming;

import java.util.Scanner;

public class Alphabets {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		//int n=8;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(j==0 && i!=0 ||
				   j==n/2 && i!=0 ||
				   i==0 && j>0 && j<n/2 ||
				   i==n/2 && j<=n/2){				// A
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			
			for(int j=0;j<n;j++){
				if(j==0  ||
				   j==n/2 && i!=0 && i!=n-1 && i!=n/2 ||
				   i==0 && j>0 && j<n/2 ||
				   i==n/2 && j<n/2 ||
					i==n-1 && j<n/2){				//B
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++){
				if(j==0 && i!=0 && i!=n-1  ||
				   i==0 && j>0 && j<=n/2 ||
					i==n-1 && j<=n/2 && j!=0){		//C
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++){
				if(j==0  ||
				   j==n/2 && i!=0 && i!=n-1  ||
				   i==0 && j>0 && j<n/2 ||
					i==n-1 && j<n/2){				//D
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++){
				if(j==0 &&  i!=n-1  ||
				   i==0 && j>0 && j<=n/2 ||
				   i==n/2 && j<=n/2 ||
					i==n-1 && j<=n/2){			//E
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++){
				if(j==0 ||
				   i==0 && j>0 && j<=n/2 ||
				   i==n/2 && j<=n/2){			//F
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			
			for(int j=0;j<n;j++){
				if(j==0 && i!=0 && i!=n-1
				|| i==0 && j!=0 && j!=n-1
				|| i==n-1 && j<n/2 && j!=0
				|| j==n/2 && i>=n/2 && i!=n-1			//G
				|| i==n/2 && j>=n/2
				|| j==n-1 && i>=n/2
				|| j==n-1 && i!=0 && i<=n/4) {
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n/2;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<n;j++){	
				if(j==0   ||
				   j==n/2 ||
				   i==n/2 && j<=n/2){			//H
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++){
				if(j==n/4 ||
				   i==0  && j<=n/2 ||
					i==n-1 && j<=n/2){			//I
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			
			for(int j=0;j<n;j++){
				if(j==n/2 && i!=n-1 ||
				   i==0  && j<=n-1
				   || i==n-1 && j<n/2 && j!=0
				   || j==0 && i>n/2
				   || i==n/2 && j<n/4 && j!=0){			//J
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			
			
			for(int j=0;j<n/2;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<n;j++){
				if(j==0  ||
					i+j==n/2 
					|| i-j==n/2){			//K
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}

			
			for(int j=0;j<n;j++){
				if(j==0  ||
					i==n-1 && j<=n/2){			//L
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			
			for(int j=0;j<n;j++){
				if(j==0  ||
					j==n-1
					|| i==j && j<=n/2
					|| i+j==n-1 && j>=n/2){			//M
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			
			for(int j=0;j<n/2;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<n;j++){
				if(j==0  ||
					j==n-1
					|| i==j){			//N
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			
			for(int j=0;j<n/2;j++)
			{
				System.out.print(" ");
			}


			for(int j=0;j<n;j++){
				if(j==0 && i!=0 && i!=n-1 ||
				   j==n/2 && i!=0 && i!=n-1  ||
				   i==0 && j>0 && j<n/2 ||
					i==n-1 && j>0 && j<n/2){				//O
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++){
				if(j==0  ||
				   j==n/2 && i!=0 &&  i<n/2 ||
				   i==0 && j>0 && j<n/2 ||
				   i==n/2 && j<n/2){					//P
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			
			for(int j=0;j<n;j++){
				if(j==0 && i!=0 && i<n-2 ||
					i==0 && j!=0 && j<3*n/4 ||
					i==n-2 && j!=0 && j<3*n/4
					|| j==3*n/4 && i!=0 && i<3*n/4
					|| i==j && j>=n/2){			//Q
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			
			for(int j=0;j<n/2;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<n;j++){
				if(j==0  ||
				   j==n/2 && i!=0 &&  i<n/2 ||
				   i==0 && j>0 && j<n/2 ||
				   i==n/2 && j<n/2 ||
				   i-j==n/2){					//R
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}

			
			for(int j=0;j<n;j++){
				if(j==0 && i<n/2 && i!=0 ||
				   i==0  && j<=n/2 && j>0 ||
				   i==n/2  && j<n/2 && j!=0||
				   j==n/2 && i>n/2 && i!=n-1 ||
				   i==n-1 && j<n/2){			//S
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++){
				if(j==n/4 ||
				   i==0  && j<=n/2){			//T
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++){
				if(j==0 && i!=n-1||
				   i==n-1  && j<n/2 && j!=0||
					j==n/2 && i!=n-1){			//U
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			
			for(int j=0;j<n;j++){
				if( j==0 && i<n/2 ||
					j==n-1 &&i<n/2 ||
					i-j==n/2 && i>=n/2 ||
					i+j==n+n/2-1 && i>=n/2){			//V
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			
			for(int j=0;j<n/2;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<n;j++){
				if(j==0  ||
					j==n-1
					|| i+j==n-1 && i>=n/2
					|| i==j && i>=n/2){			//W
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			
			for(int j=0;j<n/2;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<n;j++){
				if(i+j==n-1 ||
					i==j){			//X
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			
			for(int j=0;j<n/2;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<n;j++){
				if(i+j==n-1 && i<n/2 ||
					i==j && i<n/2
					|| j==n/2 && i>=n/2){			//Y
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			
			for(int j=0;j<n/2;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<n;j++){
				if(i==0  ||
					i==n-1
					|| i+j==n-1){			//Z
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			
			System.out.println();
			Thread.sleep(2000);
		}

	}

}
