package hashMap;

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
		int max=Integer.MIN_VALUE;
		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			if(max<m.getValue())
			{
				max=m.getKey();
			}
		}
		System.out.println(max);

}
}