package stringManipulation;

//Write a Java program to reverse a given string without using built‑in reverse methods.
//Use a character array and swap characters from both ends.
//input : str = "automation"
//output: "noitamotua"
//Explanation:
//      - Convert string to character array
//      - Swap characters from start and end moving inward
//      - Convert array back to string and prin

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "automation";
		stringReverse(str);

	}

	public static void stringReverse(String str) {
		if (str == null || str.length() == 0)
			return;
		char[] ch = str.toCharArray();
		int n = ch.length;
		for (int i = 0; i < n / 2; i++) {
			char temp = ch[i];
			ch[i] = ch[n - 1 - i];
			ch[n - 1 - i] = temp;
		}
		String s = new String(ch);
		System.out.println(s);

	}
}
