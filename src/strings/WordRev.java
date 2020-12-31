package strings;

import java.util.Scanner;

public class WordRev {
	public static void main(String[] args) {
		String s = (new Scanner(System.in)).nextLine();
		String ar[] = new String[CountWords(s)];
		convertoArray(ar, s);
		printFromArray(ar);
		reversePrintFromArray(ar);
		printCharactersInReverseOrder(ar);
		printCharactersInReverseWords(ar);
		printFromArrayWithNoOfCharctersInWord(ar);
		printFromArrayWithNoOfVowelsandCharactersInWord(ar);

	}

	private static void printFromArrayWithNoOfVowelsandCharactersInWord(String[] ar) {
		// TODO Auto-generated method stub
		for (String s : ar) {
			System.out.print(s + Assignment_1.countNoOfVowels(s) + Assignment_1.countNoOfConsonents(s) + " ");
		}

	}

	private static void printFromArrayWithNoOfCharctersInWord(String[] ar) {
		// TODO Auto-generated method stub

		for (String string : ar) {
			System.out.print(string + string.length() + " ");
		}
		System.out.println();

	}

	private static void printCharactersInReverseWords(String[] ar) {
		// TODO Auto-generated method stub
		for (int i = ar.length - 1; i >= 0; i--) {
			for (int j = ar[i].length() - 1; j >= 0; j--) {
				System.out.print(ar[i].charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println();

	}

	private static void printCharactersInReverseOrder(String[] ar) {
		// TODO Auto-generated method stub
		for (String string : ar) {
			for (int i = string.length() - 1; i >= 0; i--) {
				System.out.print(string.charAt(i));
			}
			System.out.print(" ");
		}
		System.out.println();

	}

	private static void reversePrintFromArray(String[] ar) {
		// TODO Auto-generated method stub
		for (int i = ar.length - 1; i >= 0; i--) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();

	}

	private static void printFromArray(String[] ar) {
		// TODO Auto-generated method stub
		for (String string : ar) {
			System.out.print(string + " ");
		}
		System.out.println();

	}

	private static void convertoArray(String[] ar, String s) {
		// TODO Auto-generated method stub
		String t = "";
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				t = t + s.charAt(i);
			} else if (t != "") {
				ar[j] = t;
				j++;
				t = "";
			}
		}
		if (t != "") {
			ar[j] = t;
		}

	}

	private static int CountWords(String s) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) != ' ' && s.charAt(i + 1) == ' ') {
				count++;
			}
		}
		return count + 1;
	}

}
