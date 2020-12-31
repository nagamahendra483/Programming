package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TraverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		traverseArrayList(a);
		traverseArrayListUsingIterator(a);
		

	}

	private static void traverseArrayListUsingIterator(ArrayList<Integer> a) {
		// TODO Auto-generated method stub
		Iterator itr=a.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+"\t");
		}
	}

	private static void traverseArrayList(ArrayList<Integer> a) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i)+"\t");
		}
		System.out.println();
	}

}
