package strings;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Mpas {
	public static void main(String[] args) {
		String x = (new Scanner(System.in)).nextLine();
		store(x);
	}

	private static void store(String x) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < x.length(); i++) {
			char a = x.charAt(i);
			if (map.containsKey(a)) {
				int old = map.get(a);
				old++;
				map.put(a, old);
			} else {
				map.put(a, 1);
			}
		}
		System.out.println(map);

		// Fetching KeySet it is set duplicates not allowed

		Set<Character> v = map.keySet();
		for (Character character : v) {
			System.out.print(character + "   ");
		}
		System.out.println();

		// Fetching Values it is list duplictes allowed

		Collection<Integer> c = map.values();
		for (Integer integer : c) {
			System.out.print(integer + "   ");
		}
		System.out.println();
		// Entry set
		Set<Map.Entry<Character,Integer>> m=map.entrySet();
		for (Map.Entry<Character, Integer> entry : m) {
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
	}

}
