package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class LengthOfArrayList {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<String> a = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			a.add(sc.nextLine());
		}
		System.out.println(count(a));
	}

	private static int count(ArrayList<String> a) {
		// TODO Auto-generated method stub
		Iterator itr = a.iterator();
		int count = 0;
		while (itr.hasNext()) {
			count++;
			itr.next();
		}
		return count;
	}

}
