package strings;

import java.util.Scanner;

public class Colindrome {
	public static void main(String[] args) {
		String s = (new Scanner(System.in)).nextLine();
		if(colidrome(s)) {
			System.out.println("Colindrome");
		}
		else {
			System.out.println("Not a Colindrome");
		}
		
	}

	private static boolean colidrome(String s) {
		// TODO Auto-generated method stub
		for(int i=0;i<s.length();i=i+6) {
			String t=s.substring(i, i+6);
			if(LongestPolindrome.ispolindrome(t)==null) {
				return false;
			}
		}
		return true;
	}

}
