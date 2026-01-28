package stringManipulation;

//Write a Java program to perform basic string compression.
//Replace consecutive repeating characters with <character><count>.
//input : str = "aabcccccaaa"
//output: a2b1c5a3
//Explanation:
//      - Count occurrences of each continuous character sequence
//      - Append character + count to the result
//      - Print the final compressed string

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabcccccaaa";
		stringCompression(str);
	}

	public static void stringCompression(String str) {
		String res = "";
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				count++;
			} else {
				res = res + str.charAt(i - 1) + count;
				count = 1;
			}
		}
		res = res + str.charAt(str.length() - 1) + count;
		System.out.println(res);
	}

}
