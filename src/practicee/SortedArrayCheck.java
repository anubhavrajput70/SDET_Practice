package practicee;
//Write a Java program to check whether an array is sorted in ascending order.

//input  : [1, 2, 3, 4, 7, 78]
//output : Array is Sorted: true
//
//Explanation:
//    - Compare each element with its next element
//    - If arr[i] > arr[i+1], the array is not sorted
//    - Otherwise continue checking until the end

public class SortedArrayCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 7, 78, };
		checkSorted(arr);

	}

	public static void checkSorted(int arr[]) {
		boolean isSorted = true;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				isSorted = false;
				break;
			}
		}
		System.out.println("Array is Sorted: " + isSorted);
	}

}
