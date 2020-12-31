package strings;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		System.out.println("enter string");
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String x=sc.nextLine();
		evenIndexCharacters(x);
		evenIndexCharactersInReverse(x);
		oddIndexCharacters(x);
		oddIndexCharactersInReverse(x);
		firstHalfOfString(x);
		secondHalfOfString(x);
		firstHalfOfStringInReverse(x);
		secondHalfOfStringInReverse(x);

	}
	private static void secondHalfOfStringInReverse(String x) {
		// TODO Auto-generated method stub
		
		System.out.println("secondHalfOfStringInReverse");
		if(x.length()%2==0) {
			for(int i=x.length()-1;i>=(x.length())/2;i--) {
				System.out.print(x.charAt(i));
			}
		}
		else {
			for(int i=x.length()-1;i>=(x.length())/2;i--) {
				System.out.print(x.charAt(i));
			}
		}
		System.out.println();
		System.out.println();
		
	}
	
	
	private static void firstHalfOfStringInReverse(String x) {
		// TODO Auto-generated method stub
		
		System.out.println("firstHalfOfStringInReverse");
		if(x.length()%2==0) {
			for(int i=(x.length())/2-1;i>=0;i--) {
				System.out.print(x.charAt(i));
			}
		}
		else {
			for(int i=(x.length())/2;i>=0;i--) {
				System.out.print(x.charAt(i));
			}
		}
		System.out.println();
		System.out.println();
		
		
		
	}
	
	
	
	private static void oddIndexCharacters(String x) {
		// TODO Auto-generated method stub
		System.out.println("oddIndexCharacters");
		for(int i=0;i<x.length();i++) {
			if(i%2==1) {
				System.out.print(x.charAt(i));
			}
		}
		System.out.println();
		System.out.println();
		
	}

	
	
	private static void evenIndexCharacters(String x) {
		// TODO Auto-generated method stub
		System.out.println("evenIndexCharacters");
		for(int i=0;i<x.length();i++) {
			if(i%2==0) {
				System.out.print(x.charAt(i));
			}
		}
		System.out.println();
		System.out.println();
	}

	
	
	private static void oddIndexCharactersInReverse(String x) {
		// TODO Auto-generated method stub
		System.out.println("oddIndexCharactersInReverse");
		for(int i=x.length()-1;i>=0;i--) {
			if(i%2==1) {
				System.out.print(x.charAt(i));
			}
		}
		System.out.println();
		System.out.println();
	}

	
	
	private static void evenIndexCharactersInReverse(String x) {
		// TODO Auto-generated method stub
		System.out.println("evenIndexCharactersInReverse");
		for(int i=x.length()-1;i>=0;i--) {
			if(i%2==0) {
				System.out.print(x.charAt(i));
			}
		}
		System.out.println();
		System.out.println();
	}

	
	
	
	private static void secondHalfOfString(String x) {
		// TODO Auto-generated method stub
		System.out.println("secondHalfOfString");
		if(x.length()%2==0) {
			for(int i=(x.length())/2;i<x.length();i++) {
				System.out.print(x.charAt(i));
			}
		}
		else {
			for(int i=(x.length())/2;i<x.length();i++) {
				System.out.print(x.charAt(i));
			}
		}
			System.out.println();
			System.out.println();
	}

	
	
	
	private static void firstHalfOfString(String x) {
		// TODO Auto-generated method stub
		System.out.println("firstHalfOfString");
		if(x.length()%2==0) {
			for(int i=0;i<(x.length())/2;i++) {
				System.out.print(x.charAt(i));
			}
		}
		else {
			for(int i=0;i<(x.length())/2+1;i++) {
				System.out.print(x.charAt(i));
			}
		}
		System.out.println();
		System.out.println();
	}

}
