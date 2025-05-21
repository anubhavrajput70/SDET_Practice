package practice;

public class StringLengthWithoutLengthFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Anubhav Rajput";
		findLength(s);

	}
	public static void findLength(String s)
	{
		char arr[]=s.toCharArray();
		int count=0;
		for(char c : arr)
		{
			count++;
		}
		System.out.println("String length is: "+count);
	}

}
