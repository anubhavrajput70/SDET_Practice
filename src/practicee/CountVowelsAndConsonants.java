package practicee;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "anubhav rajput";
		countVowelConsonants(s);

	}

	public static void countVowelConsonants(String str) {
		int vowel = 0, consonants = 0;
		char[] c = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] >= 'a' && c[i] <= 'z') {
				if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u')
					vowel++;
				else
					consonants++;
			}
		}
		System.out.println("Consonants = " + consonants + "\nVowels = " + vowel);
	}

}
