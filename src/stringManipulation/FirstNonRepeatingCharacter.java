package stringManipulation;

//Write a Java program to find the first non‑repeating character in a string.
//LinkedHashMap is used because it maintains insertion order.
//input : str = "swiss"
//output: w
//Explanation:
//      - Count the frequency of each character
//      - Since LinkedHashMap keeps order, the first entry with count 1
//        is the first non‑repeating charac

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "swiss";
		firstNonRepeating(str);
	}

	public static void firstNonRepeating(String str) {
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
		}
		for (Map.Entry<Character, Integer> m : map.entrySet()) {
			if (m.getValue() == 1) {
				System.out.println(m.getKey());
				break;
			}
		}
	}
}
