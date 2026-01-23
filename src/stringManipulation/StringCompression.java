package stringManipulation;

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
