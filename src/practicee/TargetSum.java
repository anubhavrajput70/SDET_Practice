package practicee;

//Write a Java program to print any one pair of numbers from an array
//that adds up to a given target using a HashMap (value -> index).
//input : arr = [6, 8, 11, 6, 7, 18], target = 17
//output: 6 11
//Explanation:
//    - For each element x, compute complement = target - x
//    - If complement already exists in the map, we found a pair
//    - Otherwise store current element's value -> index in the map
//
//Notes/Edge cases:
//    - Works with duplicates (e.g., two 6's in the array)
//    - Stops at the first valid pair; print "No pair found" if none
//    - Time complexity: O(n); Space complexity: O(n)

import java.util.HashMap;
import java.util.Map;

public class TargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 6, 8, 11, 6, 7, 18 };
		int target = 17;
		targetSum(arr, target);
	}

	public static void targetSum(int[] arr, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int temp = target - arr[i];
			if (map.containsKey(temp)) {
				System.out.println(arr[map.get(temp)] + " " + arr[i]);
				break;
			}
			map.put(arr[i], i);
		}
	}

}
