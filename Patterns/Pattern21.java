
public class Pattern21 {
	public static void main(String[] args) {
		int n = 5;
		int row = 0;
		int nst = 0;
		int nsp = 2 * n - 3;

		while (row < n) {
			int cst = 0;
			int csp = 0;
			int cst2 = 0;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			while (csp < nsp) {
				System.out.print(" ");
				csp++;
			}
			if (row == n-1) {
				cst2 = 1;
			}
			while (cst2 <= nst) {
				System.out.print("*");
				cst2++;
			}
			row++;
			nst++;
			nsp = nsp - 2;
			System.out.println();
		}

	}
}
