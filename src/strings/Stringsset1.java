package strings;

import java.util.Scanner;

public class Stringsset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = (new Scanner(System.in)).nextLine();
		removeSpaces(s);
		removeExtraSpaces(s);
		removeVowels(s);
		removeAllLowerCaseCharacters(s);
		removeAllUpperCaseCharacters(s);
		removeAllNumericCharacters(s);
		removeAllConsonants(s);
		removeAllLowercaseVowels(s);
		removeAllUppercaseVowels(s);
		removeAllLowercaseConsonants(s); 
	}

	private static void removeAllLowercaseConsonants(String s) {
		// TODO Auto-generated method stub
		
		System.out.println("after removing All Consonents ");
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			if(a >= 'a' && a <= 'z') {
				if( a == 'a' || a == 'e' || a == 'i'|| a == 'o' || a == 'u' ) {
					res = res + s.charAt(i);
				}
			}
			else {
				res = res + s.charAt(i);
			}
		}
		System.out.println(res);
		
	}

	private static void removeAllUppercaseVowels(String s) {
		// TODO Auto-generated method stub
		System.out.println("after removing All UppercaseVowels ");
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			if ( !(a == 'A' || a == 'E' || a == 'I'|| a == 'O' || a == 'U') ) {
					res = res + s.charAt(i);
			}
		}
		System.out.println(res);
		
	}

	private static void removeAllLowercaseVowels(String s) {
		// TODO Auto-generated method stub
		System.out.println("after removing All LowercaseVowels ");
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			if ( !(a == 'a' || a == 'e' || a == 'i'|| a == 'o' || a == 'u') ) {
					res = res + s.charAt(i);
			}
		}
		System.out.println(res);
		
	}

	private static void removeAllConsonants(String s) {
		// TODO Auto-generated method stub

		System.out.println("after removing All Consonents ");
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			if((a >= 'A' && a <= 'Z' || a >= 'a' && a <= 'z')) {
				if ((a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U' || a == 'a' || a == 'e' || a == 'i'
					|| a == 'o' || a == 'u') ) {
					res = res + s.charAt(i);
				}
			}
			else {
				res = res + s.charAt(i);
			}
		}
		System.out.println(res);

	}

	private static void removeAllNumericCharacters(String s) {
		// TODO Auto-generated method stub
		System.out.println("after removing AllNumericCharacters ");
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			if (!(a >= '0' && a <= '9')) {
				res = res + s.charAt(i);
			}
		}
		System.out.println(res);

	}

	private static void removeAllUpperCaseCharacters(String s) {
		// TODO Auto-generated method stub
		System.out.println("after removing AllUpperCaseCharacters ");
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			if (!(a >= 'A' && a <= 'Z')) {
				res = res + s.charAt(i);
			}
		}
		System.out.println(res);

	}

	private static void removeAllLowerCaseCharacters(String s) {
		// TODO Auto-generated method stub

		System.out.println("after removing  AllLowerCaseCharacters");
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			if (!(a >= 'a' && a <= 'z')) {
				res = res + s.charAt(i);
			}
		}
		System.out.println(res);

	}

	private static void removeVowels(String s) {
		// TODO Auto-generated method stub
		System.out.println("after removing vowels ");
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			if (!(a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U' || a == 'a' || a == 'e' || a == 'i'
					|| a == 'o' || a == 'u')) {
				res = res + s.charAt(i);
			}
		}
		System.out.println(res);

	}

	private static void removeExtraSpaces(String s) {
		// TODO Auto-generated method stub
		System.out.println("after removing extra spaces");
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			if (!(s.charAt(i) == ' ' && s.charAt(i + 1) == ' ')) {
				res = res + s.charAt(i);
			}
		}
		System.out.println(res);

	}

	private static void removeSpaces(String s) {
		// TODO Auto-generated method stub
		System.out.println("after removing spaces");
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				res = res + s.charAt(i);
			}
		}
		System.out.println(res);

	}

}
