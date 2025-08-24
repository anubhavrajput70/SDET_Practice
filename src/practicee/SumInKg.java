package practicee;

public class SumInKg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = { "5 kg", "10 kg", "500 gm", "700 gm" };
		sum(str);
	}

	public static void sum(String[] str) {
		double sum = 0;
		for (int i = 0; i < str.length; i++) {
			String[] s = str[i].split(" ");
			if (s[1].equals("gm")) {
				double n = Double.parseDouble(s[0]) / 1000;
				sum = sum + n;
			} else {
				sum = sum + Double.parseDouble(s[0]);
			}
		}
		System.out.println(sum);
	}

}
