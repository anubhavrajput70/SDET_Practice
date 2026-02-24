package practicee;

public class PrintStringPattern {
//	Input: "t@#$%1e@#$%2s@#$%t3t4";
//	Output: test1234

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "t@#$%1e@#$%2s@#$%3t4";
		printPattern(str);
	}

	public static void printPattern(String s) {
		String cleaned = s.replaceAll("[^a-zA-Z0-9]", "");
		StringBuilder letters = new StringBuilder();
		StringBuilder numbers = new StringBuilder();
		System.out.println(cleaned);
		for (char ch : cleaned.toCharArray()) {
			if (Character.isLetter(ch)) {
				letters.append(ch);
			} else {
				numbers.append(ch);
			}
		}
		System.out.println(letters.append(numbers));
	}

}
