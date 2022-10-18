import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 0;

		while (row < n) {
			int csp = n-1;
			int cst = 0;
			while (csp > row) {
				System.out.print(" ");
				csp--;
			}
			while (cst <= row) {
				System.out.print("*");
				cst++;
			}
			row++;
			System.out.println();
		}
	}
}