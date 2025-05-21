package practice;

public class ShiftEvenOdd {
	public static void main(String args[]) {
		int arr[] = { 2, 5, 8, 7, 1, 3, 6, 4, 5, 9 };
		shiftEvenOdd(arr);
	}
	
	public static void shiftEvenOdd(int arr[]) {
		int evenOdd[] = new int[arr.length];
		int j = 0;
		int k = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenOdd[j] = arr[i];
				j++;
			} else {
				evenOdd[k] = arr[i];
				k--;
			}
		}
		for (int i = 0; i < evenOdd.length; i++) {
			System.out.print(evenOdd[i] + " ");
		}
	}
}
