package stringmethods;

public class Methods {

	static int countAlphaNumeric(String x) {
		int count = 0;
		for (int i = 0; i < x.length(); i++) {
			char a = x.charAt(i);
			if (a >= '0' && a <= '9' || a >= 'A' && a <= 'Z' || a >= 'a' && a <= 'z') {
				count++;
			}
		}
		return count;
	}

	static int countAlphabets(String x) {
		int count = 0;
		for (int i = 0; i < x.length(); i++) {
			char a = x.charAt(i);
			if (a >= 'A' && a <= 'Z' || a >= 'a' && a <= 'z') {
				count++;
			}
		}
		return count;

	}

	static int countSpaces(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				count++;
			}
		}
		return count;
	}

	static int countUpperCaseCharacters(String x) {
		int count = 0;
		for (int i = 0; i < x.length(); i++) {
			char a = x.charAt(i);
			if (a >= 'A' && a <= 'Z') {
				count++;
			}
		}
		return count;
	}

	static int countLowerCaseCharacters(String x) {
		int count = 0;
		for (int i = 0; i < x.length(); i++) {
			char a = x.charAt(i);
			if (a >= 'a' && a <= 'z') {
				count++;
			}
		}
		return count;
	}

	static int countSpecialCharacters(String x) {
		int alphanumeric = countAlphaNumeric(x);
		return (x.length() - alphanumeric);
	}

	static int countNumeric(String x) {
		int count = 0;
		for (int i = 0; i < x.length(); i++) {
			char a = x.charAt(i);
			if (a >= '0' && a <= '9') {
				count++;
			}
		}
		return count;
	}

	static int countConsonents(String x) {
		int count = 0;
		for (int i = 0; i < x.length(); i++) {
			char a = x.charAt(i);
			if (a >= 'A' && a <= 'Z' || a >= 'a' && a <= 'z') {
				if (!((a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U' || a == 'a' || a == 'e' || a == 'i'
						|| a == 'o' || a == 'u'))) {
					count++;
				}
			}
		}
		return count;
	}

	static int countVowels(String x) {
		int count = 0;
		for (int i = 0; i < x.length(); i++) {
			char a = x.charAt(i);
			if (a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U' || a == 'a' || a == 'e' || a == 'i' || a == 'o'
					|| a == 'u') {
				count++;
			}
		}
		return count;

	}

	static int countLowerCaseVowels(String x) {
		int count = 0;
		for (int i = 0; i < x.length(); i++) {
			char a = x.charAt(i);
			if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
				count++;
			}
		}
		return count;
	}

	static int countUpperCaseVowels(String x) {
		int count = 0;
		for (int i = 0; i < x.length(); i++) {
			char a = x.charAt(i);
			if (a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U') {
				count++;
			}
		}
		return count;
	}
	
	
	static int countUpperCaseConsonents(String x) {
		int count = 0;
		for (int i = 0; i < x.length(); i++) {
			char a = x.charAt(i);
			if(a>='A'&& a<='Z') {
				if (!(a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U')) {
					count++;
				}
			}
		}
		return count;
	}
	
	static int countLowerCaseConsonents(String x) {
		int count = 0;
		for (int i = 0; i < x.length(); i++) {
			char a = x.charAt(i);
			if(a>='a'&& a<='z') {
				if (!(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u')) {
					count++;
				}
			}
		}
		return count;
	}
	
	static int countWords(String x) {
		int count=0;
		for(int i=0;i<x.length()-1;i++) {
			if(x.charAt(i)==' ' && x.charAt(i+1)!=' ') {
				count++;
			}
		}
		return count+1;
	}
	
	static String reverse(String s) {
		String res="";
		for(int i=s.length()-1;i>=0;i--) {
			res +=s.charAt(i);
		}
		return res;
	}
	
	
	static String removeAllLowerCaseConsonants(String s) {
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
		return res;
	}
	
	static String removeAllUpperCaseConsonants(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			if(a >= 'A' && a <= 'U') {
				if( a == 'A' || a == 'E' || a == 'I'|| a == 'O' || a == 'U' ) {
					res = res + s.charAt(i);
				}
			}
			else {
				res = res + s.charAt(i);
			}
		}
		return res;
	}

	static String removeAllUppercaseVowels(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			if ( !(a == 'A' || a == 'E' || a == 'I'|| a == 'O' || a == 'U') ) {
					res = res + s.charAt(i);
			}
		}
		return res;
	}

	static String removeAllLowercaseVowels(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			if ( !(a == 'a' || a == 'e' || a == 'i'|| a == 'o' || a == 'u') ) {
					res = res + s.charAt(i);
			}
		}
		return res;
	}

	static String removeAllConsonants(String s) {
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
		return res;
	}

	static String removeAllNumericCharacters(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			if (!(a >= '0' && a <= '9')) {
				res = res + s.charAt(i);
			}
		}
		return res;
	}

	static String removeAllUpperCaseCharacters(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			if (!(a >= 'A' && a <= 'Z')) {
				res = res + s.charAt(i);
			}
		}
		return res;
	}

	static String removeAllLowerCaseCharacters(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			if (!(a >= 'a' && a <= 'z')) {
				res = res + s.charAt(i);
			}
		}
		return res;
	}

	static String removeVowels(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			if (!(a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U' || a == 'a' || a == 'e' || a == 'i'
					|| a == 'o' || a == 'u')) {
				res = res + s.charAt(i);
			}
		}
		return res;
	}

	static String removeExtraSpaces(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			if (!(s.charAt(i) == ' ' && s.charAt(i + 1) == ' ')) {
				res = res + s.charAt(i);
			}
		}
		return res;
	}

	static String removeSpaces(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				res = res + s.charAt(i);
			}
		}
		return res;
	}
	
	static boolean isPolindrome(String s) {
		for(int i=0,j=s.length()-1;i<j;i++,j--) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	
	static boolean isContainsIntegers(String s) {
		for(int i=0;i<s.length();i++) {
			char a=s.charAt(i);
			if(!(a>='0' && a<='9')) {
				return false;
			}
		}
		return true;	
	}
	
	static boolean isContainsAlphabets(String s) {
		for(int i=0;i<s.length();i++) {
			char a=s.charAt(i);
			if(!((a>='a' && a<='z') || (a>='A' && a<='Z'))) {
				return false;
			}
		}
		return true;	
	}
	
}
