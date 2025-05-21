package practice;

public class DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 1234;
		digitSum(n);
	}

	public static void digitSum(int n)
	{
		int sum=0;
		while(n!=0)
		{
		int a = n%10;
		n=n/10;
		sum=sum+a;
		}
		System.out.println(sum);
	}

}
