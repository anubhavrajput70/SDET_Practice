package practicee;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,2,2,3,1,1,3,2};
		removeDuplicates(arr);
	}
	public static void removeDuplicates(int[] arr)
	{
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
		}
		for(Integer in:set)
		System.out.println(in);
	}

}
