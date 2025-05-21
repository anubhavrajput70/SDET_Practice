package practice;

public class VowelConsonantCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Anubhav Rajput";
		vowelCount(s);

	}
	public static void vowelCount(String s)
	{
		int vowelCount=0;
		int consonantCount=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				vowelCount++;
			}
			else
			{
				consonantCount++;
			}
		}
		System.out.println("Vowel count: "+vowelCount+"\nConsonant count: "+consonantCount);
	}

}
