package programming;

import java.util.Scanner;

public class Primeno {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ranges");
		//int n1=sc.nextInt();
		int n2=sc.nextInt();
		int count=0,prime=0;
		for(int i=2;count<n2;i++) {
			if(isPrime(i)) {
				//System.out.println(i+" ");
				count++;
				prime=i;
			}
			
		}
		System.out.println();
		System.out.println();
		System.out.println(prime);
		
	}
	public static boolean isPrime(int i) {
		for(int j=2;j<=i/2;j++)
		{
			if(i%j==0) {
				
				return false;
			}
		}
		return true;
	}

}
