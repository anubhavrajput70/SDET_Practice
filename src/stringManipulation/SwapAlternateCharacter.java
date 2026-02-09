package stringManipulation;

public class SwapAlternateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="automation";
		swapAlternate(str);
	}
	public static void swapAlternate(String str)
	{
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length-1;i++)
		{
			char temp=ch[i];
			ch[i] = ch[i+1];
			ch[i+1]=temp;
			i++;
		}
		System.out.println(new String(ch));
	}
}

