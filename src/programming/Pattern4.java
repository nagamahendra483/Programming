package programming;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int res=i*(i+1)/2;
			for(int j=1;j<=i;j++) {
				System.out.print(res+" ");
				res--;
			}
			System.out.println();
		}
	}

}
