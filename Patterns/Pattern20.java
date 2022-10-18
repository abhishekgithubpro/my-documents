
public class Pattern20 {
	public static void main(String[] args) {
		int n = 7;
		int row = 0;
		int nsp = n - 4;
		int nsp2 = 0;
		int nst = 1;
		// part1
		while (row <= n / 2) {
			// spaces
			int csp = 0;
			while (csp < nsp) {
				System.out.print(" ");
				csp++;
			}
			// star
			int cst = 0;
			while (cst < nst) {
				System.out.print("*");
				cst++;
			}
//			// spaces
			int csp2 = 0;
			while (csp2 + 1 < nsp2) {
				System.out.print(" ");
				csp2++;
			}
//			// star
			int cst2 = 0;
			if (row > 0) {
				while (cst2 < nst) {
					System.out.print("*");
					cst2++;
				}
			}

			row++;
			nsp--;
			nsp2 = nsp2 + 2;
			System.out.println();
		}
		// part2
		row = 0;
		nsp = 0;
		nst = 0;
		nsp2 = n-4;
		while (row < n / 2) {
			int csp = 0;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 0;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			int csp2 = 0;
			while (csp2 < nsp2) {
				System.out.print(" ");
				csp2++;
			}
			int cst2 = 0;
			if(row == n/2-1) {
				cst2 = 1;
			}
			while (cst2 <= nst) {
				System.out.print("*");
				cst2++;
			}

			csp--;
			row++;
			nsp2 = nsp2 - 2;
			nsp++;
			System.out.println();
		}
	}
}