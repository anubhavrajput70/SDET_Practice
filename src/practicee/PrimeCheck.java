package practicee;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=127;
		checkPrime(n);
	}
	public static void checkPrime(int n)
	{
		boolean isPrime= true;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				isPrime= false;
			}
		}
		System.out.println(isPrime);
			
	}
}
