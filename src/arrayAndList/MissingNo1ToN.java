package arrayAndList;

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
