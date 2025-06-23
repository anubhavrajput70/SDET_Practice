package practicee;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12345;
		sumOfDigit(n);

	}
	public static void sumOfDigit(int n)
	{ 
		int sum=0;
		while(n!=0)
		{
			int a=n%10;
			n=n/10;
			sum=sum+a;
		}
		System.out.println("Sum of digits: " + sum);
	}

}
