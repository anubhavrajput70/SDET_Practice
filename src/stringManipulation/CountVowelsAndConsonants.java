package stringManipulation;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Automation";
		countVowelAndConsonants(str.toLowerCase());
	}

	public static void countVowelAndConsonants(String str) {
		int vowels = 0, consonants = 0;
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				if (ch[i] == 'a' || ch[i] == 'i' || ch[i] == 'e' || ch[i] == 'o' || ch[i] == 'u')
					vowels++;
				else
					consonants++;
			}
		}
		System.out.println("Vowels: "+vowels+"\nConsonants: "+consonants);
	}

}
