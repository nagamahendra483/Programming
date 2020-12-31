package strings;

import java.util.Scanner;
import java.util.TreeSet;

public class RemoveDuplicateLink {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		TreeSet<String> t=new TreeSet<String>();
		for(int i=0;i<n;i++) {
			t.add(sc.next());
		}
		for(String x:t)
		{
			System.out.println(x);
		}
	}
}
