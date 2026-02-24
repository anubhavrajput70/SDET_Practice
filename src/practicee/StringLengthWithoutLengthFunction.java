package practicee;

//Write a Java program to find the length of a string **without** using length().
//input  : s = "automation"
//output : 10
//
//Explanation:
//    - Keep accessing characters using s.charAt(index)
//    - Increment index until an exception occurs (index goes out of bounds)
//    - The final index value equals the string length
//
//Note:
//    - This approach intentionally uses exception control flow to mimic length()
//    - See alternative, exception-free methods after this clas

public class StringLengthWithoutLengthFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "automation";
		stringLength(s);
	}

	public static void stringLength(String s) {
		int len = 0;
		try {
			while (true) {
				s.charAt(len);
				len++;
			}
		} catch (Exception e) {
		}

		System.out.println(len);
	}

}
