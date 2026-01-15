package arrayAndList;

public class MaximumSumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		maximumSumSubarray(arr);

	}

	public static void maximumSumSubarray(int[] arr) {
		int maxSum = Integer.MIN_VALUE, sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			maxSum = Math.max(maxSum, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		System.out.println(maxSum);
	}

}
