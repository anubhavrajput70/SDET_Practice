package practicee;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="automation";
		characterOccurance(s);

	}
	public static void characterOccurance(String s)
	{
		Map<Character, Integer> map= new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		for(Map.Entry<Character,Integer> m: map.entrySet())
		{
			System.out.println(m.getKey()+" -> "+m.getValue());
		}
		System.out.println(map);
	}

}
