package hashMap;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4, 5,1, 4, 2, 5, 4, 3};
		firstNonRepeating(arr);

	}
	public static void firstNonRepeating(int[] arr)
	{
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i =0;i<arr.length;i++)
		{
			map.put(arr[i], map.getOrDefault(arr[i] ,0)+ 1);
		}
		for(Map.Entry<Integer,Integer> m:map.entrySet())
		{
			if(m.getValue()==1)
				System.out.println(m.getKey());
			break;
		}
	}

}
