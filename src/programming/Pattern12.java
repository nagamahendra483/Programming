package programming;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=n*n;
		int count=1;
		for (int i=0;i<n ;i++ )
		{
			int k=i+1;
			for (int j=0;j<n ;j++ )
			{
				if(k<10){
				System.out.print(0);
				}
				System.out.print(k+" ");
				k+=5;
			}
		System.out.print("    ");
		for (int j=0;j<n ;j++ )
		{
			if(s<10){
				System.out.print(0);
			}
			System.out.print(s+" ");
			s--;
		}
		System.out.print("    ");
			for (int j=0;j<n ;j++ )
			{
				if((i & 1) == 1){
					if((j & 1)==1){
						System.out.print(0+" ");
					}
					else{
						System.out.print(1+" ");
					}
				}
				else{
				if((j & 1)==1){
						System.out.print(1+" ");
					}
					else{
						System.out.print(0+" ");
					}
				}
			}
			System.out.print("    ");
			for (int j=0;j<=i ;j++)
			{
				if(count<10){
				System.out.print(0);
				}
				System.out.print(count++ +" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		count=1;
		for (int i=0;i<n ;i++)
		{
			for (int j=0;j<=i ;j++)
			{
				if(count<10){
				System.out.print(0);
				}
				System.out.print(count++);
				if(j<i){
				System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println("enter number ");
		int x=sc.nextInt();
		for(int i=1;i<=x;i++){
		System.out.print(i*(i+1)/2+" ");
		}
		System.out.println();

	}

}
