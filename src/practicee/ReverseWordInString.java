package practicee;

public class ReverseWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java coding interview";
		reverseWord( s);

	}
	public static void reverseWord(String s)
	{
		String[] str =s.split(" ");
		String string ="";
		for(int i=0;i<str.length;i++)
		{
			string= string + reverseString(str[i])+" ";
		}
		System.out.println(string);
	}
	public static String reverseString(String n)
	{
		String str="";
		for(int i=0;i<n.length();i++)
		{
			str= n.charAt(i)+str;
		}
		return str;
	}

}
