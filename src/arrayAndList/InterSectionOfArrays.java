package arrayAndList;

//Write a Java program to find the intersection of the two arrays, 
//where the intersection should contain only unique common elements,
//regardless of how many times they appear in the arrays.
//input : int[] a = { 1, 2, 2, 1 };
//      int[] b = { 2, 2 };
//output: [2]


import java.util.HashSet;
import java.util.Set;

public class InterSectionOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 2, 1 };
		int[] b = { 2, 2 };
		intersection(a, b);
	}

	public static void intersection(int[] a, int[] b) {
		if (a.length == 0 || b.length == 0) return;
		Set<Integer> set = new HashSet<>();
		Set<Integer> set1 = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		for (int i = 0; i < b.length; i++) {
			if (set.contains(b[i])) {
				set1.add(b[i]);
			}
		}
		System.out.println(set1);
	}

}
