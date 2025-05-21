package practice;

public class SwapNumber {

	public static void main(String args[]) {
		int a = 60, b = 40;
		swap(a, b);
	}

	public static void swap(int a, int b) {
		System.out.println("Before Swap a: " + a + "\nBefore Swap b: " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swap a: " + a + "\nAfter Swap b: " + b);
	}
}
