package arrayAndList;

//Write a Java program to move all zeros in the array to the end
//while maintaining the order of non‑zero elements.
//input : arr = [0, 1, 0, 3, 12]
//output: [1, 3, 12, 0, 0]
//Explanation:
//      - Traverse the array
//      - Copy all non‑zero elements to the front
//      - Fill remaining positions with zer

public class MoveAllZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 1, 0, 3, 12 };
		moveZeros(arr);
	}

	public static void moveZeros(int[] arr) {
		if (arr == null || arr.length == 0)
			return;
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[j] = arr[i];
				j++;
			}
		}
		while (j < arr.length) {
			arr[j] = 0;
			j++;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
