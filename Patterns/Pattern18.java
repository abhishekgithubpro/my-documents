
public class Pattern18 {
	public static void main(String[] args) {
		int n = 7;
		int row = 0;
		int nst = 0;
		int nsp = n - 1;
		while (row < n) {
			int cst = 0;
			int csp = 0;
			// spaces
			while (csp < nsp) {
				System.out.print(" ");
				csp++;
			} // stars
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			if (row < n / 2) {
				nst = nst + 2;
				nsp--;
			} else {
				nsp++;
				nst = nst - 2;
			}
			row++;
			System.out.println();
		}
	}
}
