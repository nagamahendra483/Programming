package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		covertListToArray(a);

	}

	private static void covertListToArray(ArrayList<Integer> a) {
		// TODO Auto-generated method stub
		int ar[] = new int[a.size()];
		for (int i = 0; i < a.size(); i++) {
			ar[i] = (int) (a.get(i));
		}
		for (int j : ar) {
			System.out.print(j + "  ");
		}

	}

}
