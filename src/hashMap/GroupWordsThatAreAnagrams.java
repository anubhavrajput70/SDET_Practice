package hashMap;

//Write a Java program to group words that are anagrams of each other.
//Words are grouped if they contain the same characters in any order.
//input : words = ["eat", "tea", "tan", "ate", "nat", "bat"]
//output (example as groups):
//      [[eat, tea, ate], [tan, nat], [bat]]
//Explanation:
//      - For each word, sort its characters to form a key
//      - Use the sorted string as a key in the map
//      - Add the original word to the list mapped by that key

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupWordsThatAreAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "eat", "tea", "tan", "ate", "nat", "bat" };
		anagram(words);

	}

	public static void anagram(String[] words) {
		HashMap<String, List<String>> map = new HashMap<>();
		for (int i = 0; i < words.length; i++) {
			char ch[] = words[i].toCharArray();
			Arrays.sort(ch);
			String key = new String(ch);
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(words[i]);
		}
		System.out.println(map);
	}
}
