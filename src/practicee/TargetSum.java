package practicee;

import java.util.HashMap;
import java.util.Map;

public class TargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {6, 8, 11, 6, 7, 18};
		int target = 17;
		targetSum(arr,target);
	}
	public static void targetSum(int[] arr, int target)
	{
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			int temp = target - arr[i];
			if(map.containsKey(temp))
			{
				System.out.println(arr[map.get(temp)]+" "+arr[i]);
				break;
			}
			map.put(arr[i], i);
		}
	}

}
