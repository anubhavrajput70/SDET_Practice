package practicee;

public class StringLengthWithoutLengthFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "automation";
		stringLength(s);

	}

	public static void stringLength(String s) {
		int len = 0;
		try {
			while (true) {
				s.charAt(len);
				len++;
			}
		} catch (Exception e) {
		}

		System.out.println(len);
	}

}
