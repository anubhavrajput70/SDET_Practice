package hashMap;

//Write a Java program to find the most frequent element in an array
//using a HashMap (element -> count).
//input : arr = [1, 3, 2, 3, 4, 3, 5]
//output: 3
//Explanation:
//      - Count frequency of each element using a map
//      - Track the element with the highest frequ

import java.util.HashMap;
import java.util.Map;

public class CountMostFrequentElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 2, 3, 4, 3, 5 };

		countMostFrequent(arr);
	}

	public static void countMostFrequent(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		int max = Integer.MIN_VALUE;
		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			if (max < m.getValue()) {
				max = m.getKey();
			}
		}
		System.out.println(max);

	}
}