package arrayAndList;

public class SecondLargetNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 35, 1, 10, 34 };
		secondLargest(arr);
	}

	public static void secondLargest(int[] arr) {
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
		System.out.println(max2);
	}
}
