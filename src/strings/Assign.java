package strings;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = (new Scanner(System.in)).nextLine();
		pattern1(s);
		pattern2(s);
		pattern3(s);
		pattern4(s);
		pattern5(s);

	}

	private static void pattern5(String s) {
		// TODO Auto-generated method stub
		ArrayList<Character> a=new ArrayList<Character>();
		for (int i = 0; i < s.length(); i++) {
			a.add(s.charAt(i));
		}
		Collections.sort(a);
		for (Character character : a) {
			System.out.print(character);
		}
		
	}

	private static void pattern4(String s) {
		// TODO Auto-generated method stub
		TreeMap<Character, Integer> m = new TreeMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			if (m.containsKey(a) != true) {
				m.put(a,1);
			}
			else {
				int temp=m.get(a);
					temp++;
				m.put(a, temp);
			}
		}
		Set<Map.Entry<Character,Integer>> m1=m.entrySet();
		for (Map.Entry<Character, Integer> entry : m1) {
			System.out.print(entry.getKey());
		}
		System.out.println();
		
	}

	private static void pattern3(String s) {
		// TODO Auto-generated method stub
		LinkedHashMap<Character, Integer> m = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			if (m.containsKey(a) != true) {
				m.put(a,1);
			}
			else {
				int temp=m.get(a);
					temp++;
				m.put(a, temp);
			}
		}
		Set<Map.Entry<Character,Integer>> m1=m.entrySet();
		for (Map.Entry<Character, Integer> entry : m1) {
			System.out.print(entry.getKey());
		}
		System.out.println();
		
	}

	private static void pattern2(String s) {
		// TODO Auto-generated method stub
		LinkedHashMap<Character, Integer> m = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			if (m.containsKey(a) != true) {
				m.put(a,1);
			}
			else {
				int temp=m.get(a);
					temp++;
				m.put(a, temp);
			}
		}
		Set<Map.Entry<Character,Integer>> m1=m.entrySet();
		for (Map.Entry<Character, Integer> entry : m1) {
			System.out.print(entry.getKey()+""+entry.getValue());
		}
		System.out.println();
		
	}

	private static void pattern1(String s) {
		// TODO Auto-generated method stub
		TreeMap<Character, Integer> m = new TreeMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			if (m.containsKey(a) != true) {
				m.put(a,1);
			}
			else {
				int temp=m.get(a);
					temp++;
				m.put(a, temp);
			}
		}
		Set<Map.Entry<Character,Integer>> m1=m.entrySet();
		for (Map.Entry<Character, Integer> entry : m1) {
			System.out.print(entry.getKey()+""+entry.getValue());
		}
		System.out.println();
		
	}

}
