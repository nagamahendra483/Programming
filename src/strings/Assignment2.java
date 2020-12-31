package strings;

import java.util.HashSet;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many link you placed");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			String x=sc.nextLine();
			inserttolist(x);
		}
		display();
		System.out.println("enter string to reverse words");
		String x=sc.nextLine();
		rev(x);
	}
	private static void rev(String x) {
		// TODO Auto-generated method stub
		String arr[]=x.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void display() {
		for(Object x:h) {
			System.out.println(x);
		}
	}
	
	
	
	public static HashSet h=new HashSet();
	private static void inserttolist(String x) {
		// TODO Auto-generated method stub
		h.add(x);
		
	}

}
