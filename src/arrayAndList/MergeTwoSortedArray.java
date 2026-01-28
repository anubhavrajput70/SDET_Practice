package arrayAndList;


//Write a Java program to merge two sorted arrays in-place such that
//after merging, the first array contains the smaller elements and
//the second array contains the larger elements, maintaining overall order.
//input : a = [1, 3, 5]
//      b = [2, 4, 6]
//output:
//      a -> 1 2 3
//      b -> 4 5 6
//
//Note: This approach compares current elements and, when needed, swaps
//    a[i] with b[j], then "inserts" b[j] into correct position in `b`
//    by bubbling it forward to keep `b` sorted.


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
