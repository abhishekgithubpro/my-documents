import java.util.Scanner;

public class Pattern9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 0;
		int csp = 0;
		int str = 1;
		while (row < n) {
			// spaces
			int spc = n - 1;
			int cst = 0;
			while (csp < spc) {
				System.out.print(" ");
				spc--;
			}
			// stars
			while (cst < str) {
				System.out.print("*");
				cst++;
			}
			csp++;
			row++;
			str = str + 2;
			System.out.println();

		}
	}
}