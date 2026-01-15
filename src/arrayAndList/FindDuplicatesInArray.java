package arrayAndList;

import java.util.HashSet;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 2, 5, 1 };
		findDuplicate(arr);
	}

	public static void findDuplicate(int arr[]) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (set.contains(arr[i])) {
				System.out.println(arr[i]);
			}
			else
			set.add(arr[i]);
		}
	}

}
