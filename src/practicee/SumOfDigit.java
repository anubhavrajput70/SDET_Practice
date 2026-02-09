package practicee;

//Write a Java program to find the sum of digits of a number.
//input  : n = 12345
//output : Sum of digits: 15
//
//Explanation:
//    - Extract the last digit using n % 10
//    - Add it to sum
//    - Remove the last digit using n / 10
//    - Repeat until n becomes 0

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12345;
		sumOfDigit(n);

	}

	public static void sumOfDigit(int n) {
		int sum = 0;
		while (n != 0) {
			int a = n % 10;
			n = n / 10;
			sum = sum + a;
		}
		System.out.println("Sum of digits: " + sum);
	}

}
