package practicee;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []digit= {1,8,9};
		int[] res= plusOne(digit);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
	}
	
	public static int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {		
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		int[] result = new int[digits.length + 1];
		result[0] = 1;
		return result;
	}

}
