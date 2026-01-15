package arrayAndList;

public class MoveAllZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 1, 0, 3, 12 };
		moveZeros(arr);
	}

	public static void moveZeros(int[] arr) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[j] = arr[i];
				j++;
			}
		}
		while (j < arr.length) {
			arr[j] = 0;
			j++;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
