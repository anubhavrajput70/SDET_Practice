package arrayAndList;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 3, 5 };
		int[] b = { 2, 4, 6 };
		mergeSorted(a, b);
	}

	public static void mergeSorted(int[] a, int[] b) {
		int i = 0, j = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				i++;
			} else if (a[i] > b[j]) {
				int temp = a[i];
				a[i] = b[j];
				b[j] = temp;

				int k = j;
				while (k + 1 < b.length && b[k] > b[k + 1]) {
					int t = b[k];
					b[k] = b[k + 1];
					b[k + 1] = t;
					k++;
				}
				i++;
			}
		}
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + " ");
		}
		System.out.println();
		for (int k = 0; k < b.length; k++) {
			System.out.print(b[k] + " ");
		}
	}

}
