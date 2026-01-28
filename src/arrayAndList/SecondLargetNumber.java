package arrayAndList;

//Write a Java program to find the second largest number in an array.
//The array may contain duplicate values but the second largest should be distinct.
//input : arr = [12, 35, 1, 10, 34]
//output: 34
//Explanation:
//      - max1 holds the largest number
//      - max2 holds the second largest number
//      - Update max2 only when a distinct second largest is found

public class SecondLargetNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 35, 1, 10, 34 };
		secondLargest(arr);
	}

	public static void secondLargest(int[] arr) {
		if (arr.length < 2) {
			System.out.println("Second largest not possible");
			return;
		}
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max1 < arr[i]) {
				max2 = max1;
				max1 = arr[i];
			} else if (max1 > arr[i] && max2 < arr[i]) {
				max2 = arr[i];
			}
		}
		if (max2 == Integer.MIN_VALUE) {
			System.out.println("No second largest element");
		} else {
			System.out.println("Second Largest = " + max2);
		}
		System.out.println(max2);
	}
}
