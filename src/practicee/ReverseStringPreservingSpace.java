package practicee;

public class ReverseStringPreservingSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java coding interview";
		reversePreserveSpace(s);

	}
	public static void reversePreserveSpace(String s)
	{
		String s1=s.replace(" ", "");
		String s2="";
		String s3="";
		for(int i=0;i<s1.length();i++)
		{
			s2=s1.charAt(i)+s2;
		}
		
		int j=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				s3=s3+" ";
			}
			else
			{
				s3=s3+s2.charAt(j);
				j++;
			}
		}
		System.out.println(s3);
	}
	public static void reversePreserveSpace1(String s)
	{
		
	}


}
