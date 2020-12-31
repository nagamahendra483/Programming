package stringmethods;

import java.util.Scanner;

public class Launch extends Methods {

	public static void main(String[] args) {
		// count operations on strings
		String s = "ThisEnable@458"; // (new Scanner(System.in)).nextLine();
		System.out.println("No Of Vowels : " + countVowels(s));
		System.out.println("No Of Consonents : " + countConsonents(s));
		System.out.println("No Of Alphabets : " + countAlphabets(s));
		System.out.println("No Of Upper Case Characters : " + countUpperCaseCharacters(s));
		System.out.println("No Of Lower Case Characters : " + countLowerCaseCharacters(s));
		System.out.println("No Of Upper Case Vowels : " + countUpperCaseVowels(s));
		System.out.println("No Of Lower Case Vowels : " + countLowerCaseVowels(s));
		System.out.println("No Of Upper Case Consonents : " + countUpperCaseConsonents(s));
		System.out.println("No Of Lower Case Consonents : " + countLowerCaseConsonents(s));
		System.out.println("No Of Spaces : " + countSpaces(s));
		System.out.println("No Of Numerics : " + countNumeric(s));
		System.out.println("No Of Alpha Numerics : " + countAlphaNumeric(s));
		System.out.println("No Of Special Characters : " + countSpecialCharacters(s));
		System.out.println("No Of Words : " + countWords(s));
		System.out.println();
		System.out.println();
		
		System.out.println("Reverse Of String : " + reverse(s));
		System.out.println("After Removing Spaces : " + removeSpaces(s));
		System.out.println("After Removing Extra Spaces : " + removeExtraSpaces(s));
		System.out.println("After Removing Vowels : " + removeVowels(s));
		System.out.println("After Removing All Lower Case Characters : " + removeAllLowerCaseCharacters(s));
		System.out.println("After Removing All Upper Case Characters : " + removeAllUpperCaseCharacters(s));
		System.out.println("After Removing All Numeric Case Characters : " + removeAllNumericCharacters(s));
		System.out.println("After Removing All Consonents : " + removeAllConsonants(s));
		System.out.println("After Removing All Lower Case Vowels : " + removeAllLowercaseVowels(s));
		System.out.println("After Removing All Upper Case Vowels : " + removeAllUppercaseVowels(s));
		System.out.println("After Removing All Lower Case Consonents : " + removeAllLowerCaseConsonants(s));
		System.out.println("After Removing All Upper Case Consonents : " + removeAllUpperCaseConsonants(s));
		
		
		System.out.println("is Polindrome : "+ isPolindrome(s));
		System.out.println("is String Contains Only Integers : " + isContainsIntegers("546460465"));
		System.out.println("is String Contains Only Alphabets : " + isContainsAlphabets("ThisisHGHJTGnagamahenrda"));
	}
}
