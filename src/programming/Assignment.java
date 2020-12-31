package programming;

import java.util.Scanner;

public class Assignment {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int n=sc.nextInt();
		int res=1;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
			res=i*(i+1)/2;
			for(int j=1;j<=i;j++) {
				System.out.print(res+" ");
				res--;
			}
			}
			else
			{
				res=(i*(i+1)/2)-i+1;
				for(int j=1;j<=i;j++) {
					System.out.print(res+" ");
					res++;
				}
			}
			System.out.println();
		}
		/* 2nd pattern*/
		System.out.println();
		System.out.println();
		int k=0;
		for (int i=0;i<n ;i++ )
		{
			if(i%2==0){
				k++;
				for (int j=0;j<=n-1 ;j++ )
				{
					System.out.print(k+" ");
				}
				k++;
				System.out.print(k);
			}
			else
			{
				k++;
				System.out.print(k+" ");
				k--;
				for (int j=0;j<=n-1 ;j++ )
				{
					System.out.print(k+" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				if(j==0 || i==n-1 || i==j) {
					System.out.print(1+" ");
				}
				else {
					System.out.print(0+" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--) {
					System.out.print(" ");
			}
			int num=1;
			for(int j=0;j<=i;j++) {
				System.out.print(num+ " ");
                num = num * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}

}
