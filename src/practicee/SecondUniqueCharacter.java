package practicee;

import java.util.LinkedHashMap;
import java.util.Map;

public class SecondUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str="aaalkmlkjji";
	        rearrange(str);
	    }
	    public static void rearrange(String str)
	    {
	        Map<Character,Integer> map= new LinkedHashMap<>();
	        for(int i=0;i<str.length();i++)
	            {
	                map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
	            }
	        int count=0;
	        for(Map.Entry<Character,Integer> entry: map.entrySet())
	            {
	                if(entry.getValue().equals(1))
	                    count++;
	                if(entry.getValue().equals(1)&&count==2)
	                {
	                    System.out.println(entry.getKey());
	                }
	            }
	    }
}
