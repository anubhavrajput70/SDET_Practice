package practicee;

public class ReverseOnlyCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="a,b$c#_de";
		reverseCharacter(str);
	}
	public static void reverseCharacter(String str)
	{
		String clean=str.replaceAll("[^a-zA-Z0-9]", "");
		String rev="";
		for(int i=0;i<clean.length();i++)
		{
			rev=clean.charAt(i)+rev;
		}

		String res="";
		int j=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLetter(str.charAt(i)))
			{
				res=res+rev.charAt(j);
				j++;
			}else
			{
				res=res+str.charAt(i);
			}
		}
		System.out.println(res);
	}
}
