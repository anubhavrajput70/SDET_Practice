package slidingWindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeInEveryWindowOfSizeK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-8, 2, 3, -6, 10} ;
		int k = 2;
		firstNegative(arr, k);

	}
	public static void firstNegative(int arr[],int k)
	{
		 List<Integer> list = new ArrayList<>();
	        Queue<Integer> queue = new LinkedList<>();
	        int i = 0, j = 0;
	        while (j < arr.length) {
	            if (arr[j] < 0) {
	                queue.add(j);  // store index
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
