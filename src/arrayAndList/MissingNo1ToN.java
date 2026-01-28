package arrayAndList;

//Write a Java program to find the missing number from an array 
//containing numbers from 1 to n, where exactly one number is missing.
//input : arr = [1, 2, 4, 5], n = 5
//output: 3
//Explanation: The numbers from 1 to 5 should be 1,2,3,4,5
//           The sum of given array is 12, total sum is 15
//           Missing number = 15 - 12 =

public class MissingNo1ToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 4, 5 };
		int n = 5;
		missingNumber(arr, n);

	}

	public static void missingNumber(int[] arr, int n) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		int total = n * (n + 1) / 2;
		System.out.println(total - sum);
	}

}
