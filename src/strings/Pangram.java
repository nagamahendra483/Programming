package strings;

import java.util.Scanner;

public class Pangram {
	public static void main(String[] args) {
		String s = (new Scanner(System.in)).nextLine();
		if(isPangram(s)) {
			System.out.println("PANGRAM");
		}
		else {
			System.out.println("NOT A PANGRAM");
		}
	}

	private static boolean isPangram(String s) {
		// TODO Auto-generated method stub
		int count=0;
		for(char i='a';i<='z';i++) {
			if(s.indexOf(i)>=0) {
				count++;
			}
		}
		if(count==26) {
			return true;
		}else {
			return false;
		}
	}

}
