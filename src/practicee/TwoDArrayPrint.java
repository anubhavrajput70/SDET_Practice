package practicee;

//Write a Java program to print a 2D array row by row

//and indent each subsequent row based on the row index
//input : arr = [[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]]
//output (diagonally shifted):
//1 2 3 4
//5 6 7 8
//  9 10 11 12
//    13 14 15 16
//Explanation:
//    - For row i, print i * 2 spaces before printing the row elements
//    - Then print all elements in that row separated by a single space

public class TwoDArrayPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		printArray(arr);
	}

	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i != 0) {
				for (int k = 0; k < arr[i].length; k++) {
					System.out.print("  ");
				}
			}
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
