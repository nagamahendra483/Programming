package programming;

import java.util.Scanner;

public class Naveen {
	public static void main(String[] args) {
		System.out.println("Enter Font Size :");
		int n=(new Scanner(System.in)).nextInt();
		
		
		
		System.out.println();
		
		
		
		for(int i=0;i<n;i++){
			System.out.print("        ");
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

			System.out.print("       ");
			
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
				if(j==n/4 ||
				   i==0  && j<=n/2){			//T
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
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
			
			System.out.print("       ");

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
				if(i+j==n-1 && i<n/2 ||
					i==j && i<n/2
					|| j==n/2 && i>=n/2){			//Y
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		
		
		
		
		
		
		
		for(int i=0;i<n;i++){
			System.out.print("                                          ");
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
				if(j==0  ||
					j==n-1
					|| i==j){			//N
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
