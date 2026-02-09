package practicee;

//Write a Java program to swap two numbers without using a third variable.
//input : a = 20, b = 50
//output:
//    Before Swap a=20, b=50
//    After Swap  a=50, b=20   (using arithmetic)
//    After Swap  a=20, b=50   (using XOR)
//
//Explanation:
//    - First swap uses addition–subtraction logic
//    - Second swap uses bitwise XOR technique
//    - Both techniques do not require a temporary variable

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		int b = 50;
		swapNum(a, b);
	}

	public static void swapNum(int a, int b) {
		System.out.println("Before Swap a=" + a + ", b=" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swap a=" + a + ", b=" + b);

		// Alternative using Bit manipulations
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After Swap a=" + a + ", b=" + b);
	}
}
