
public class Pattern26 {
	public static void main(String[] args) {
		int n = 5;
		int row = 0;

		int nsp = n - 1;
		int nst = 0;
		while (row < n) {
			int csp = 0;
			while (csp < nsp) {
				System.out.print(" ");
				csp++;
			}
			nsp--;
			int col = 1;
			int cst = 0;
			while (cst <= nst) {
				System.out.print(col);
				col++;
				cst++;
			}
			nst = nst + 2;
            row++;
			System.out.println();
		}
	}
}
