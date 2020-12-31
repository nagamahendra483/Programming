package arrays;

import java.util.Scanner;

public class LeftRightSumEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println(solution(ar));

	}

	private static String solution(int[] ar) {
		// TODO Auto-generated method stub
		int lsum=0;
		int rsum=0;
		for(int i=0;i<ar.length;i++) {
			rsum +=ar[i];
		}		
		for(int i=0;i<ar.length;i++) {
			rsum -=ar[i];
			if(rsum==lsum) {
				return "YES";
			}else {
				lsum +=ar[i];
			}
		}
		return "NO";
	}

}
