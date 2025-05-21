package practice;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=17;
		checkPrime(n);
	}
	public static void checkPrime(int n)
	{
		boolean flag= false;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=true;
				break;
			}
		}
		if(flag)
			System.out.println("not a prime");
		else
			System.out.println("prime");
	}
	
		

}
