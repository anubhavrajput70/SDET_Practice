package practice;

public class EvenOddInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 5, 6, 4, 6, 7, 8, 3, 2, 8 };
		evenOdd(arr);
	}

	public static void evenOdd(int[] arr) {
		int evenCount = 0;
		int oddCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}

		}
		System.out.println("Even: " + evenCount + "\nOdd: " + oddCount);
	}

}
