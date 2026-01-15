package hashMap;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfEachElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 2, 3, 3, 3 };
		countFrequency(arr);
	}

	public static void countFrequency(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			System.out.println(m.getKey()+" -> "+m.getValue());
		}
	}
}
