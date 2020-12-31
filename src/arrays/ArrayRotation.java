package arrays;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = { 8, 2, 3, 6, 5, 4 };
		int br[] = Arrays.copyOf(ar, ar.length);
		ar.clone();

		int res[] = rotateleft(ar, 3);
		for (int i : res) {
			System.out.print(i + "  ");
		}
		System.out.println();
		int res1[] = rotateright(ar, 3);
		for (int i : res1) {
			System.out.print(i + "  ");
		}

	}

	private static int[] rotateright(int[] nums, int k) {
		// TODO Auto-generated method stub
		if (k > nums.length)
			k = k % nums.length;

		int[] result = new int[nums.length];

		System.arraycopy(nums, nums.length - k, result, 0, k);

		System.arraycopy(nums, 0, result, k, nums.length - k);

		return result;

	}

	private static int[] rotateleft(int[] nums, int k) {
		// TODO Auto-generated method stub
		if (k > nums.length)
			k = k % nums.length;

		int[] result = new int[nums.length];

		System.arraycopy(nums, k, result, 0, nums.length - k);

		System.arraycopy(nums, 0, result, nums.length - k, k);

		return result;
	}

}
