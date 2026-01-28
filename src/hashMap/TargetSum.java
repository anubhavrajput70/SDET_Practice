package hashMap;

//Write a Java program to find index pairs (i, j) such that arr[i] + arr[j] = target sum

//using the hashing (complement) technique in O(n) time.
//input : arr = [2, 4, 3, 5, 7, 8, 9], sum = 7
//output (possible pairs by index): 
//      0 1   (2 + 5? no; example below shows actual pairs for values/indices)
//      0 2   (2 + 5? example; see explanation)
//NOTE:
//- This code prints index pairs as soon as they are found (i from left, prior index from map).
//- For the given input, actual index pair printed will be "0 3" (2 + 5) and "2 1" won't appear
//  because 5 occurs at index 3, discovered after 2; similarly 3 pairs with 4 at indices (2,1) 
//  won’t print since 4 is seen before 3 (complement must already be in map).
//- If you want all value pairs instead of indices or to avoid duplicates, we can adjust the logic

import java.util.HashMap;

//This problem uses the hashing (complement) technique to achieve linear time complexity.
public class TargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 4, 3, 5, 7, 8, 9 };
		int sum = 7;
		targetSum(arr, sum);
	}

	public static void targetSum(int[] arr, int sum) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int temp = sum - arr[i];
			if (map.containsKey(temp)) {
				System.out.println(map.get(temp) + " " + i);
			}
			map.put(arr[i], i);

		}
	}

}
