package practicee;

public class OccurenceOnIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 1, 1, 3, 2, 4, 3 };
		occurenceOnIndex(arr);
	}

	public static void occurenceOnIndex(int arr[]) {

		int[] nums = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			nums[temp]++;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(nums[i] + " ");
		}

	}

}
