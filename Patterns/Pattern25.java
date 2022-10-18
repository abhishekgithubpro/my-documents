
public class Pattern25 {
	public static void main(String[] args) {
		int n = 5;
		int row = 0;
		int nsp = n - 1;
		int nst = 0;
		int col = 1;
		
		while (row < n) {

			int csp = 0;
			while (csp < nsp) {
				System.out.print("\t");
				csp++;
			}
			int cst = 0;
			while (cst <= nst) {
				System.out.print(col + "\t");
				col++;
				cst++;
			}

			row++;
			nst = nst + 2;
			nsp--;
			System.out.println();

		}
	}
}
