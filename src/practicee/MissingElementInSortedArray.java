package practicee;

public class MissingElementInSortedArray {

	public static void main(String[] args) {
		int arr[] = { 6, 7, 10, 11, 12, 15 };
		missingElement(arr);
	}

	public static void missingElement(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int curr = arr[i];
			int next = arr[i + 1];
			for (int j = curr + 1; j < next; j++) {
				System.out.print(j + " ");
			}
		}
	}
}
