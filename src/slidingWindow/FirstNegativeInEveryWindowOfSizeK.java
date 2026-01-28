package slidingWindow;

//Write a Java program to print the first negative number in every window of size K
//using the sliding window technique.
//input  : arr = [-8, 2, 3, -6, 10], k = 2
//windows: [-8, 2] → -8
//       [2, 3]  → 0
//       [3, -6] → -6
//       [-6,10] → -6
//output : [-8, 0, -6, -6]
//Explanation:
//      - Use queue to store indices of negative numbers
//      - Slide the window using i (start) and j (end)
//      - For each window of size k, print the first negative if present else print

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeInEveryWindowOfSizeK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { -8, 2, 3, -6, 10 };
		int k = 2;
		firstNegative(arr, k);

	}

	public static void firstNegative(int arr[], int k) {
		List<Integer> list = new ArrayList<>();
		Queue<Integer> queue = new LinkedList<>();
		int i = 0, j = 0;
		while (j < arr.length) {
			if (arr[j] < 0) {
				queue.add(j); // store index
			}

			if ((j - i + 1) < k) {
				j++;
			} else if ((j - i + 1) == k) {
				if (!queue.isEmpty() && queue.peek() >= i && queue.peek() <= j) {
					list.add(arr[queue.peek()]);
				} else {
					list.add(0);
				}
				if (!queue.isEmpty() && queue.peek() == i) {
					queue.poll();
				}
				i++;
				j++;
			}
		}
		System.out.println(list);

	}

}
