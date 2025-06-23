package practicee;

public class FindSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,23,4,5,3,34,5,3,3,2,33};
		System.out.println("min number: "+findMin(arr));

	}
	public static int findMin(int[] arr)
	{
		int temp= Integer.MAX_VALUE;
		for(int i = 0 ;i<arr.length;i++)
		{
			if(temp>arr[i])
			{
				temp= arr[i];
			}
		}
		return temp;
	}


}
