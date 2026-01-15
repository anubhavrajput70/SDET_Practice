package practicee;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 5, 5, 6, 9,10};
		int target =9;
		binarySearch(target, arr);
	}
	public static void binarySearch(int target,int[] arr)
	{
		int start = 0;
		int end = arr.length-1;
		while (start <= end) {
			int mid = start+(end-start)/2;

			if (target == arr[mid]) {
				System.out.println("Found at index: " + mid);
				return;
			}
			if(target<arr[mid])
			{
				end=mid-1;
			}
			if(target>arr[mid])
			{
				start=mid+1;
			}
		}
	}

}
