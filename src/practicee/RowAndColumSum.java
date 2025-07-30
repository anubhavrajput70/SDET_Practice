package practicee;

public class RowAndColumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr[]= {{1,2,3},{4,5,6},{7,8,9}};
		rowColSum(arr);
	}

	public static void rowColSum(int[] arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=0;j<arr[i].length;j++)
			{
				sum=sum+arr[j][i];
			}
			System.out.print(sum+" ");
		}
	}
}
