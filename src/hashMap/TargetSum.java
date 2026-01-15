package hashMap;

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
