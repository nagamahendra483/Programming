package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		convertArrayToList(ar);
		printList(a);

	}
	private static void printList(ArrayList<Integer> a2) {
		// TODO Auto-generated method stub
		System.out.println(a2);
		
	}
	static ArrayList<Integer> a = new ArrayList<Integer>();

	private static void convertArrayToList(int[] ar) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ar.length; i++) {
			a.add(ar[i]);
		}

	}

}
