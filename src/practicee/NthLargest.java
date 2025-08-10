package practicee;

import java.util.Collections;
import java.util.PriorityQueue;

public class NthLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 4, 6, 7, 8, 3, 54, 23 };
		int n = 3;
		System.out.println(n + "th largest element is: " + nthLargest(arr, n));
		System.out.println(n + "th smallest element is: " + nthSmallest(arr, n));
	}

	public static int nthLargest(int[] nums, int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for (int num : nums) {
			minHeap.add(num);
			if (minHeap.size() > k) {
				minHeap.poll();
			}
		}
		return minHeap.peek();
	}

	public static int nthSmallest(int[] nums, int k) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		for (int num : nums) {
			maxHeap.add(num);
			if (maxHeap.size() > k) {
				maxHeap.poll();
			}
		}
		return maxHeap.peek();
	}

}
