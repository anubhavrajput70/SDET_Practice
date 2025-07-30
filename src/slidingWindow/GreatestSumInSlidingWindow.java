package slidingWindow;

public class GreatestSumInSlidingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
		maxInSlidingWindow(nums, k);
	}
	public static void maxInSlidingWindow(int[] nums,int k)
	{
		int i=0,j=0,sum=0,max=Integer.MIN_VALUE;
		while(j<nums.length)
		{
			sum=sum+nums[j];
			if((j-i+1)<k)
			{
				j++;
			}
			else if((j-i+1)==k)
			{
				max=Math.max(max, sum);
				sum=sum-nums[i];
				j++;
				i++;
			}
		}
	System.out.print(max);
	}

}
