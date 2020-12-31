package arrays;

public class SubArray {
	public static void main(String[] args) {
		int ar[]= {2,3,4,5,8,6,7};
		for (int i = 1; i < ar.length; i++) {
			for (int j = 0; j <= ar.length-i; j++) {
				for (int k = j; k < i+j; k++) {
					System.out.print(ar[k]+" ");
				}
				System.out.println();
			}
		}
	}

}
