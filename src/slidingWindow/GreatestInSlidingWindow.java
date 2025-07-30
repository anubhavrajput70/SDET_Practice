package slidingWindow;

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
		while (b != nums.length+1) {
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
