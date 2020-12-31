package arrays;

import java.util.Scanner;

public class LargestPrime {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(factor(n));
		
	}

	private static int factor(int n) {
		// TODO Auto-generated method stub
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				if(n/2<i)
				{
					if(isprime(i))
					{
						return i;
					}
				}
				else
				{
					if(isprime(n/i))
					{
						return n/i;
					}
				}
			}
		}
		return 1;
		
	}

	private static boolean isprime(int n) {
		// TODO Auto-generated method stub
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
		
	}

}
