package arrayAndList;

//Write a Java program to rearrange an array such that
//all even numbers come first and all odd numbers go to the end.
//The relative order of even/odd numbers is not important.
//input : arr = [3, 8, 5, 12, 7, 6, 4, 5]
//output (example): [4, 8, 6, 12, 7, 5, 5, 3]
//Explanation:
//      - Use two pointers: i from start, j from end
//      - Move i forward if arr[i] is even
//      - Move j backward if arr[j] is odd
//      - Otherwise swap arr[i] and arr[j]

public class ShiftEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 8, 5, 12, 7, 6, 4, 5 };
		shiftEvenOdd(arr);
	}

	public static void shiftEvenOdd(int[] arr) {
		int i = 0, j = arr.length - 1;
		while (i <= j) {
			if (arr[i] % 2 == 0)
				i++;
			else if (arr[j] % 2 != 0)
				j--;
			else {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}

}
