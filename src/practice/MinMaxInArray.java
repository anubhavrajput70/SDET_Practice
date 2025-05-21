package practice;

public class MinMaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 4, 6, 3, 5, 7, 8, 3, 43, 45, 23, 4, 23 };
		minMax(arr);

	}

	public static void minMax(int[] arr) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i])
				min = arr[i];
			if (max < arr[i])
				max = arr[i];
		}
		System.out.println("Minimum: " + min + "\nMaximum: " + max);

	}

}
