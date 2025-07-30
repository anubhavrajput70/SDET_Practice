package practicee;

public class PrintStingPattern {

	public static void main(String[] args) {
		String a = "a3b12";
		printPattern(a);
	}

	public static void printPattern(String a) {
		String result = "";
		for (int i = 0; i < a.length();) {
			char s = a.charAt(i++); // get the character
			String num = "";
			// collect digits after the character
			while (i < a.length() && Character.isDigit(a.charAt(i))) {
				num = num + a.charAt(i++);
			}
			int n = Integer.parseInt(num);
			for (int j = 0; j < n; j++) {
				result = result + s;
			}
		}
		System.out.println(result);
	}
}
