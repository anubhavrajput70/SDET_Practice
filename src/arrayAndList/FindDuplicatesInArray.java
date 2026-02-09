package arrayAndList;

//Write a Java program to find all duplicate numbers in an array.

//input : arr = {1, 2, 3, 4, 2, 5, 1}
//output: 2 1
//Explanation:
//      - Use a HashSet to track seen elements
//      - If an element already exists in the set, it is a duplicate
//      - Print duplicate elements as they appe

import java.util.HashSet;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 2, 5,3,2,2,2, 1 };
		findDuplicate(arr);
	}

	public static void findDuplicate(int arr[]) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (set.contains(arr[i])) {
				System.out.print(arr[i] + " ");
			} else
				set.add(arr[i]);
		}
	}

}
