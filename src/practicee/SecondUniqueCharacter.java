package practicee;
//Write a Java program to find the **second** non-repeating (unique) character

//in a string while preserving the original character order.
//input  : "aaalkmlkjji"
//unique : chars with frequency 1 → [a? no, a=3] [l? 1] [k? 2] [m? 1] [j? 2] [i? 1]
//order  : first unique = 'l', second unique = 'm'
//output : m
//
//Explanation:
//    - Use LinkedHashMap<Character, Integer> to count frequencies **and** retain order
//    - Iterate once to build counts
//    - Iterate in insertion order to find the 2nd character whose count == 1

import java.util.LinkedHashMap;
import java.util.Map;

public class SecondUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaalkmlkjji";
		rearrange(str);
	}

	public static void rearrange(String str) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
		}
		int count = 0;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue().equals(1))
				count++;
			if (entry.getValue().equals(1) && count == 2) {
				System.out.println(entry.getKey());
			}
		}
	}
}
