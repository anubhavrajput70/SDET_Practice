package practicee;

//
//Write a Java program to sort only the numeric substrings inside a mixed string.
//input  : "ab431xy98cd765pq"
//output : "ab134xy89cd567pq"
//
//Explanation:
//      - Scan the string left to right
//      - When a digit sequence starts, collect the full run of digits (e.g., "431")
//      - Sort the digits within that run (→ "134")
//      - Append the sorted run to result
//      - Non-digit characters are appended as-is
//
//Notes:
//      - Sorting happens per contiguous numeric group, not across the whole string
//      - For global digit sorting while keeping digit positions, see the alternative below
//

import java.util.Arrays;

public class SortOnlyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ab431xy98cd765pq";
		sortNumber(str);
	}

	public static void sortNumber(String str) {
		String res = "";
		for (int i = 0; i < str.length();) {
			if (Character.isDigit(str.charAt(i))) {
				String s1 = "";
				while (i < str.length() && Character.isDigit(str.charAt(i))) {
					s1 = s1 + str.charAt(i++);
				}
				char ch[] = s1.toCharArray();
				Arrays.sort(ch);
				String s2 = new String(ch);
				res = res + s2;
			} else {
				res = res + str.charAt(i++);
			}

		}
		System.out.println(res);
	}

}
