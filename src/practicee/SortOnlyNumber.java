package practicee;

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
