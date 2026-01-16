package stringManipulation;

import java.util.HashSet;

public class CheckUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcd";
		checkUnique(str);

	}

	public static void checkUnique(String str) {
		HashSet<Character> set = new HashSet<>();
		boolean isDuplicate = false;
		for (int i = 0; i < str.length(); i++) {
			if (set.contains(str.charAt(i))) {
				System.out.println(str.charAt(i) + " character already exists");
				isDuplicate = true;
				break;
			}
			set.add(str.charAt(i));
		}
		if (!isDuplicate) {
			System.out.println("All characters are unique");
		}
	}

}
