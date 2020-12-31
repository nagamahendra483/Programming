package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class TraverseHashSet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<Integer> a = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		traverseHashSet(a);
	}

	private static void traverseHashSet(HashSet<Integer> a) {
		// TODO Auto-generated method stub
		Iterator itr=a.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+"\t");
		}
		
	}

}
