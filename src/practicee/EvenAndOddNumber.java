package practicee;

import java.util.ArrayList;

public class EvenAndOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,5,6,4,34,23,2,1,21,3,34,23};
		evenOdd(arr);
	}
	public static void evenOdd(int[] arr)
	{
		ArrayList even = new ArrayList<>();
		ArrayList odd = new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				even.add(arr[i]);
			}
			else {
				odd.add(arr[i]);
			}
		}
		System.out.println("even: "+even);
		System.out.println("odd: "+odd);
	}

}
