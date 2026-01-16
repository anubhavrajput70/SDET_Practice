package stringManipulation;

import java.util.LinkedHashSet;

public class RemoveAllDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		String str = "programming";
		removeDuplicates(str);

	}
	public static void removeDuplicates(String str)
	{
		LinkedHashSet<Character> set= new LinkedHashSet<>();
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		System.out.println(set);
	}

}
