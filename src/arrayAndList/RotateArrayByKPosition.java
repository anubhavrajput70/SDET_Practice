package arrayAndList;

//Write a Java program to rotate an array by k positions to the right.
//Each rotation moves the last element to the front.
//input : arr = [1, 2, 3, 4, 5], k = 2
//After 1st rotation: [5, 1, 2, 3, 4]
//After 2nd rotation: [4, 5, 1, 2, 3]
//output: [4, 5, 1, 2, 3]

public class RotateArrayByKPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 2;
		rotateByK(arr, k);
	}

	public static void rotateByK(int arr[], int k) {
		if (arr == null || arr.length <= 1) {
			return;
		}
		k = k % arr.length;
		for (int i = 0; i < k; i++) {
			rotateByOne(arr);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void rotateByOne(int[] arr) {
		int temp = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = temp;
	}

}