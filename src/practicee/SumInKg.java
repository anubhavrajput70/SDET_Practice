package practicee;

//Write a Java program to sum weights given in"kg"and"gm"format.
//input  : ["5 kg", "10 kg", "500 gm", "700 gm"]
//output : 16.2  (5 + 10 + 0.5 + 0.7)
//
//Explanation:
//      - Split each string into numeric value and unit
//      - If unit is grams, convert to kg by dividing by 1000
//      - If unit is kg, add directly
//      - Keep cumulative sum in kilograms

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
