package practice;

public class StringReverseWithEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "I Love Java";
		System.out.println(reverseString(a));

	}

	public static String reverseString(String a) {
		String arr[] = a.split(" ");
		String s = "";
		for (int i = 0; i < arr.length; i++) {
			String rev = reverse(arr[i]);
			s = rev + " " + s;
		}
		return s;
	}

	public static String reverse(String s) {
		String a = "";
		for (int i = 0; i < s.length(); i++) {

			a = s.charAt(i) + a;

		}
		return a;
	}
}
