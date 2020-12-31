package strings;

import java.util.Scanner;

public class NumberToWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter seven digit number");
		String s=(new Scanner(System.in)).nextLine();
		String t="";
		for(int i=0;i<s.length()-3;i++) {
			if(i%2==0) {
			t =t+charToWord(s.charAt(i))+" ";
			}else {
				t =t+charToWord1(s.charAt(i))+" ";
			}
			t=t+currency(i)+" ";
		}
		
		for(int i=s.length()-3;i<s.length();i++) {
			if(i%2==1) {
			t =t+charToWord(s.charAt(i))+" ";
			}else {
				t =t+charToWord1(s.charAt(i))+" ";
			}
			t=t+currency(i)+" ";
		}
		System.out.println(t);
	}

	private static String charToWord1(char a) {
		// TODO Auto-generated method stub
		switch(a) {
		case '1' : return "one";
		case '2' : return "two";
		case '3' : return "three";
		case '4' : return "four";
		case '5' : return "five";
		case '6' : return "six";
		case '7' : return "seven";
		case '8' : return "eight";
		case '9' : return "nine";
		default  : return "";
	}
		
	}

	private static String currency(int i) {
		
		// TODO Auto-generated method stub
		switch(i) {
		case 1 : return "lakhs";
		case 3 : return "thousand";
		case 4 : return "hundred and";		
		default  : return "";
	}
		
	}

	private static String charToWord(char a) {
		// TODO Auto-generated method stub
		switch(a) {
			case '1' : return "ten";
			case '2' : return "twenty";
			case '3' : return "thirty";
			case '4' : return "forty";
			case '5' : return "fifty";
			case '6' : return "sixty";
			case '7' : return "seventy";
			case '8' : return "eighty";
			case '9' : return "ninty";
			default  : return "";
		}
	}

}
