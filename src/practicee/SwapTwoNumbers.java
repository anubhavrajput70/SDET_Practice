package practicee;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		int b = 50;
		swapNum(a,b);
	}
	public static void swapNum(int a, int b)
	{
		System.out.println("Before Swap a="+a+", b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swap a="+a+", b="+b);
		
		//Alternative using Bit manipulations
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swap a="+a+", b="+b);
	}
}
