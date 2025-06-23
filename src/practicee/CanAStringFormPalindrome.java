package practicee;

import java.util.HashSet;
import java.util.WeakHashMap;

public class CanAStringFormPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "racecar";
		canFormPalindrome(s);

	}
	public static void canFormPalindrome(String s)
	{
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			if(!set.add(s.charAt(i)))
				set.remove(s.charAt(i));
		}
		if((set.size()<=1))
		{
			System.out.println("can form");
		}
		else
		{
			System.out.println("can not form");
		}
	}

}
