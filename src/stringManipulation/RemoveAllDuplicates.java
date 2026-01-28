package stringManipulation;

//Write a Java program to remove all duplicate characters from a string
//while preserving the original order of characters.
//input : str = "programming"
//output: [p, r, o, g, a, m, i, n]
//Explanation:
//      - Convert string to characters
//      - Add characters to LinkedHashSet (keeps insertion order + removes duplicates)
//      - Print the final set

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
