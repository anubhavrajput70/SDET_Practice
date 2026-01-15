package stringManipulation;

import java.util.HashMap;

public class AnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "listen", s2 = "silent";
		if (anagramCheck(s1, s2))
			System.out.println("anagram");
		else
			System.out.println("not an anagram");
	}

	public static boolean anagramCheck(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
		}
		for (int i = 0; i < s2.length(); i++) {
			if (!map.containsKey(s2.charAt(i)))
				return false;
			map.put(s2.charAt(i), map.get(s2.charAt(i)) - 1);
			if (map.get(s2.charAt(i)) == 0)
				map.remove(s2.charAt(i));
		}
		return map.isEmpty();
	}
}
