package practicee;

public class PalimdromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madam";
		palimdromeCheck(s);

	}
	public static void palimdromeCheck(String str)
	{
		boolean flag = true;
		for(int i = 0;i< str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i))
			{
				flag = false;
			}
		}
		System.out.println(flag);
	}

}
