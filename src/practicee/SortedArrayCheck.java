package practicee;

public class SortedArrayCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,7,78,};
		checkSorted(arr);

	}
	public static void checkSorted(int arr[])
	{
		boolean isSorted = true;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				isSorted=false;
				break;
			}
		}
		System.out.println("Array is Sorted: "+isSorted);
	}

}
