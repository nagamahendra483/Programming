package strings;

import java.lang.Character.Subset;
import java.util.Scanner;

public class LongestPolindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = (new Scanner(System.in)).nextLine();
		print(s);
	}

	private static void print(String s) {
		// TODO Auto-generated method stub
		String cp = "";
		cp += s.charAt(0);
		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = i+1 ; j < s.length(); j++) {
				String s1 = s.substring(i, j+1);
				//System.out.println(s1);
				String n = ispolindrome(s1);
				if (n != null) {
					if (cp.length() < n.length()) {
						cp=n;
					}

				}
			}
		}
		System.out.println(cp);
	}

	public static String ispolindrome(String s1) {
		// TODO Auto-generated method stub
		for(int i=0,j=s1.length()-1;i<j;i++,j--) {
			if(s1.charAt(i) !=s1.charAt(j)) {
				return null;
			}
		}
		return s1;
	}

}
