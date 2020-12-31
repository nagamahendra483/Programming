package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class CheckElementExist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<Integer> h = new HashSet<Integer>();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int temp=sc.nextInt();
			a.add(temp);
			h.add(temp);
		}
		int key=sc.nextInt();
		if(checkElementExistInArrayList(a,key)) {
			System.out.println("element exist in arraylist");
		}
		else {
			System.out.println("element not exist array list");
		}
		if(checkElementExistInHashSet(h,key)) {
			System.out.println("element exist in Hashset");
		}
		else {
			System.out.println("element not exist Hashset");
		}
		

	}

	private static boolean checkElementExistInHashSet(HashSet<Integer> h, int key) {
		// TODO Auto-generated method stub
		Iterator itr=h.iterator();
		while(itr.hasNext()) {
			if((int)(itr.next())==key) {
				return true;
			}
		}
		return false;
		
	}

	private static boolean checkElementExistInArrayList(ArrayList<Integer> a, int key) {
		// TODO Auto-generated method stub
		for (Integer integer : a) {
			if(integer==key) {
				return true;
			}
		}
		return false;
		
	}

	

	

}
