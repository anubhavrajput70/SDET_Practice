package practicee;

import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class NthLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 4, 6, 7, 8, 3, 54, 23 };
		int n = 3;
		System.out.println(n+"th largest element is: "+nthLargest(arr, n));
		System.out.println(n+"th smallest element is: "+nthSmallest(arr, n));
	}
	public static int nthLargest(int[] nums, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int num : nums) 
		{
			pq.add(num);
			if (pq.size() > k)
			{
				pq.poll();
			}
		}
		return pq.peek();
	}
	public static int nthSmallest(int[] nums, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int num : nums) 
		{
			pq.add(num);
			if (pq.size() > k)
			{
				pq.poll();
			}
		}
		for(int value: pq)
		{
			System.out.println(value);
		}
		
		return pq.peek();
	}

}
