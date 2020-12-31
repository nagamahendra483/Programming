package arrays;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println(minAndMaxInArraySum(ar));
	}

	private static String minAndMaxInArraySum(int[] ar) {
		// TODO Auto-generated method stub
		MaxAndMin.findMaxMin(ar);
		return (MaxAndMin.sum-MaxAndMin.max)+"  "+(MaxAndMin.sum-MaxAndMin.min);
	}

}
