package slidingWindow;

//Write a Java program to find the greatest element in every sliding window of size K
//using a Max-Heap (PriorityQueue in reverse order).
//input  : nums = [1, 3, -1, -3, 5, 3, 6, 7], k = 3
//windows: [1,3,-1] → 3
//       [3,-1,-3] → 3
//       [-1,-3,5] → 5
//       [-3,5,3] → 5
//       [5,3,6]  → 6
//       [3,6,7]  → 7
//output : [3, 3, 5, 5, 6, 7]
//Explanation:
//      - Iterate window from a to b
//      - Push all elements of the window into max heap
//      - The root of the heap gives the maximum
//      - Clear heap for next window

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class GreatestInSlidingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
		slidingWindow(nums, k);
	}

	public static void slidingWindow(int nums[], int k) {
		List<Integer> list = new ArrayList<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		int a = 0, b = k;
		while (b != nums.length + 1) {
			for (int i = a; i < b; i++) {
				pq.add(nums[i]);
			}
			int n = pq.peek();
			list.add(n);
			for (int i = a; i < b; i++) {
				pq.poll();
			}
			a++;
			b++;
		}
		System.out.println(list);
	}

}
