package practicee;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		factorial(n);
		System.out.println("Factorial of "+n+" is = "+factorialRecursive(n)+"(recursive)");
	}
	public static void factorial(int n)
	{ 
		int fact=1, b=n;
		while(n!=1)
		{
			fact=fact*n;
			n--;
		}
		System.out.println("Factorial of "+b+" is = "+fact+"(loop)");
	}
	public static int factorialRecursive(int n)
	{
		if(n==0||n==1)
		{
			return 1;
		}
		return n*factorialRecursive(n-1);
	}

}
