package practicee;

import java.util.HashMap;
import java.util.Map;

public class MaxAndLeastOccuringCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="programming";
		maxAndLeastOccuring(s);

	}
	public static void maxAndLeastOccuring(String s)
	{
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		System.out.println(map);
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		char maxChar=0,minChar=0;
		for(Map.Entry<Character,Integer> m: map.entrySet())
		{
			if(m.getValue()>max)
			{
				max=m.getValue();
				maxChar=m.getKey();
			}
			if(m.getValue()<min)
			{
				min=m.getValue();
				minChar=m.getKey();
			}
		}
		System.out.println(max+" "+maxChar);
		System.out.println(min+" "+minChar);
	}

}
