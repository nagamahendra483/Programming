package strings;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s =sc.nextLine();
		String s1=sc.nextLine();
		int n=sc.nextInt();
		pattern1(s,s1,n);
		pattern2(s,s1,n);
		pattern3(s,s1,n);

	}

	private static void pattern3(String s, String s1, int n) {
		// TODO Auto-generated method stub
		System.out.println("Pattern3 : ");
		String t = "";
		for(int i=s.length()-1;i>=n;i--) {
			t=t+s.charAt(i);
		}
		t=t+s1;
		for(int i=n-1;i>=0;i--) {
			t = t+s.charAt(i);
		}
		System.out.println(t);
		System.out.println();
		
	}

	private static void pattern2(String s, String s1, int n) {
		// TODO Auto-generated method stub
		System.out.println("Pattern2 : ");
		String t = "";
		for(int i=n;i<s.length();i++) {
			t=t+s.charAt(i);
		}
		for(int i=s1.length()-1;i>=0;i--) {
			t=t+s1.charAt(i);
		}
		for(int i=0;i<n;i++) {
			t=t+s.charAt(i);
		}
		System.out.println(t);
		System.out.println();
	}

	private static void pattern1(String s, String s1, int n) {
		// TODO Auto-generated method stub
		System.out.println("Pattern1 : ");
		 String t = "";
		for(int i=n-1;i>=0;i--) {
			t = t+s.charAt(i);
		}
		t=t+s1;
		for(int i=s.length()-1;i>=n;i--) {
			t=t+s.charAt(i);
		}
		System.out.println(t);
		System.out.println();
	}

}
