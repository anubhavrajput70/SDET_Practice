package stringManipulation;

//Write a Java program to count the number of vowels and consonants in a string.
//Convert the string to lowercase before processing to make comparison easy.
//input : str = "Automation"
//output:
//      Vowels: 6
//      Consonants: 4
//Explanation:
//      - Check each character
//      - If it is between 'a' and 'z', it is an alphabet
//      - If it is a, e, i, o, u → vowel
//      - Otherwise → consonant

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
		System.out.println("Vowels: " + vowels + "\nConsonants: " + consonants);
	}

}
