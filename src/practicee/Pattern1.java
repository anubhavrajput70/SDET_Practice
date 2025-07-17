package practicee;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		printPattern(n);
	}

	public static void printPattern(int n) {
		for (int i = 0; i <= n; i++) {
			int a = 65;
			for (int j = 0; j < i; j++) {
				System.out.print((char) a);
				a++;
				System.out.print("_");
			}
			System.out.println();
		}
	}

}
