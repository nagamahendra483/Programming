package strings;

import java.util.Scanner;

public class Assignment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter string");
		Scanner sc=new Scanner(System.in);
		String x=sc.nextLine();
		indexMultiplesOf3(x);
		middleCharacter(x);
		countNoOfVowels(x);
		countNoOfConsonents(x);
		countNoOfNumeric(x);
		countNoOfAlphaNumeric(x);
	}
	
	

	 static int countNoOfAlphaNumeric(String x) {
		// TODO Auto-generated method stub
		
		System.out.print("NoOfAlphaNumeric : ");
		int count=0;
		for(int i=0;i<x.length();i++) {
			char a=x.charAt(i);
			if(a>='0'&& a<='9' || a>='A' && a<='Z' ||a>='a' && a<='z') {
				count++;
			}
		}
		System.out.println(count);
		return count;
		
	}
	
	

	private static void countNoOfNumeric(String x) {
		// TODO Auto-generated method stub
		System.out.print("NoOfNumerics : ");
		int count=0;
		for(int i=0;i<x.length();i++) {
			char a=x.charAt(i);
			if(a>='0'&& a<='9') {
				count++;
			}
		}
		System.out.println(count);
		
	}
	
	
	

	 static int countNoOfConsonents(String x) {
		// TODO Auto-generated method stub
		//System.out.print("NoOfConsonents : ");
		int count=0;
		for(int i=0;i<x.length();i++) {
			char a=x.charAt(i);
			if(!((a=='A'||a=='E'||a=='I'||a=='O'||a=='U'||a=='a'||a=='e'||a=='i'||a=='o'||a=='u') || (a>='0'&& a<='9'))) {
				count++;
			}
		}
		//System.out.println(count);
		return count;
	}
	
	
	

	 static int countNoOfVowels(String x) {
		// TODO Auto-generated method stub
		//System.out.print("NoOfVowels : ");
		int count=0;
		for(int i=0;i<x.length();i++) {
			char a=x.charAt(i);
			if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U'||a=='a'||a=='e'||a=='i'||a=='o'||a=='u') {
				count++;
			}
		}
		//System.out.println(count);
		return count;
		
	}
	
	
	

	private static void middleCharacter(String x) {
		// TODO Auto-generated method stub
		System.out.print("middleCharacter : ");
		int n=(x.length())%2;
		int m=(x.length())/2;
		if(n==0) {
			System.out.println(x.charAt(m-1)+""+x.charAt(m));
		}
		else {
			System.out.println(x.charAt(m));
		}
		
	}
	
	
	

	private static void indexMultiplesOf3(String x) {
		// TODO Auto-generated method stub
		System.out.print("charactersInIndexMultiplesOf3 : ");
		for(int i=0;i<x.length();i=i+3) {
			System.out.print(x.charAt(i));
		}
		System.out.println();
	}

}
