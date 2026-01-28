package stringManipulation;

//Write a Java program to reverse only the characters in a string,
//while keeping all digits in their original positions.
//input : str = "abcd123de"
//steps  : remove digits & replace them with '_' → "abcd___de"
//       reverse only letters                → "edcba___"
//       put digits back in original order   → "ed123dcba"
//output: ed123dcba

import java.util.ArrayList;
import java.util.List;

public class ReverseOnlyCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stubAnubhav Rajput
//		output - ed123dcba
		String str1 = "abcd123de";

		StringBuilder sb = new StringBuilder();
		List<Integer> integer = new ArrayList<>();

		for (int i = 0; i < str1.length(); i++) {
			if (!Character.isDigit(str1.charAt(i))) {
				sb.append(str1.charAt(i));
			} else {
				char ch = str1.charAt(i);
				integer.add(ch - '0');
				sb.append('_');
			}
		}
		System.out.println(sb);
		System.out.println(integer);
		sb.reverse();
		int temp = 0;
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == '_') {
				sb.setCharAt(i, (char) (integer.get(temp++) + '0'));
			}
		}

		System.out.println(sb);

	}

}
