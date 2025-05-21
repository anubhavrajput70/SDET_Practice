package practice;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "I Love Java";
		System.out.println(reverse(a));

	}

	public static String reverse(String a) {
		String arr[]= a.split(" ");
		String s="";
		for(int i=0;i<arr.length;i++)
		{
			s=arr[i]+" "+s;
		}
		return s;
	}

}
