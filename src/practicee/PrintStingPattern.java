package practicee;

public class PrintStingPattern {

	public static void main(String[] args) {
		String a = "a3b12";
		String b="3a12b";
		printPattern1(a);
		printPattern2(b);
	}

	public static void printPattern1(String a) {
		String result = "";
		for (int i = 0; i < a.length();) {
			char s = a.charAt(i++); 
			String num = "";
			while (i < a.length() && Character.isDigit(a.charAt(i))) {
				num = num + a.charAt(i++);
			}
			int n = Integer.parseInt(num);
			for (int j = 0; j < n; j++) {
				result = result + s;
			}
		}
		System.out.println(a+" -> "+result);
	}
	public static void printPattern2(String b) {
		String result="";
		for(int i=0;i<b.length();)
		{
			String num="";
			while(b.charAt(i)>b.length() && Character.isDigit(b.charAt(i)))
			{
				num=num+b.charAt(i++);
			}
			int n= Integer.parseInt(num);
			char c=b.charAt(i++);
			for(int j=0;j<n;j++)
			{
				result=result+c;
			}
		}
		System.out.println(b+" -> "+result);
	}

	
}
