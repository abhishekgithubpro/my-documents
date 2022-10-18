
public class Pattern17 {
	public static void main(String[] args) {
		int n = 7;
		int row = 0;
		int nst = n / 2;
		int nsp = 0;
		while (row < n) {
			int cst = 0;
			int csp = 0;
			int cst2 = 0;
			// stars
			while (cst < nst) {
				System.out.print("*");
				cst++;
			} // spaces
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			} // stars
			while (cst2 < nst) {
				System.out.print("*");
				cst2++;
			}

			if (row < n / 2) {
				nst--;
				nsp = nsp + 2;
			} else {
				nsp = nsp - 2;
				nst++;
			}
			row++;
			System.out.println();
		}
	}
}
