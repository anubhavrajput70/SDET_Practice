package practicee;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Anubhav";
		System.out.println(reverseString(s));
	}
	public static String reverseString(String str)
	{
		String temp="";
		for(int i=0;i<str.length();i++)
		{
			temp=str.charAt(i)+temp;
		}
		return temp;
	}

}
