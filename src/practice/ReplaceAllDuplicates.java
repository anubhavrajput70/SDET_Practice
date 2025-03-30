package practice;

import java.util.HashMap;
import java.util.Map;
//- Input: "Automation"
//- Output: "2u22m22i2n"

public class ReplaceAllDuplicates {

	public static void main(String[] args) {
		String s = "Automation";
		System.out.println(replaceDuplicates(s.toLowerCase()));
	}

	public static String replaceDuplicates(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}
		StringBuilder result = new StringBuilder();
		for (char ch : s.toCharArray()) {
			int count = map.get(ch);
			if (count > 1) {
				result.append(count);
			} else {
				result.append(ch);
			}
		}
		return result.toString();
	}

}
