package practicee;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		fibonacciSeries(n);
		System.out.println("recursion");
		for(int i=0;i<n;i++)
		{
		System.out.print(fib(i)+" ");
		}
		
	}

	public static void fibonacciSeries(int n) {
		int a = 0, b = 1;
		System.out.println("loop");
		System.out.print(a + " " + b + " ");
		for (int i = 2; i < n; i++) {
			int c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
		System.out.println();
	}

	public static int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		return fib(n - 1) + fib(n - 2);
	}

}
