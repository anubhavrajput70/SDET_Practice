package slidingWindow;

//Write a Java program to find the maximum sum of any subarray/window of size K
//using the sliding window technique.
//input : nums = [1, 3, -1, -3, 5, 3, 6, 7], k = 3
//windows & sums:
//       [1,3,-1] → 3
//       [3,-1,-3] → -1
//       [-1,-3,5] → 1
//       [-3,5,3] → 5
//       [5,3,6] → 14
//       [3,6,7] → 16  ← maximum
//output: 16
//Explanation:
//      - Expand window by adding nums[j]
//      - When window size reaches k, compute sum and update max
//      - Slide window: subtract nums[i], move both i and 

public class GreatestSumInSlidingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
		maxInSlidingWindow(nums, k);
	}

	public static void maxInSlidingWindow(int[] nums, int k) {
		int i = 0, j = 0, sum = 0, max = Integer.MIN_VALUE;
		while (j < nums.length) {
			sum = sum + nums[j];
			if ((j - i + 1) < k) {
				j++;
			} else if ((j - i + 1) == k) {
				max = Math.max(max, sum);
				sum = sum - nums[i];
				j++;
				i++;
			}
		}
		System.out.print(max);
	}

}
