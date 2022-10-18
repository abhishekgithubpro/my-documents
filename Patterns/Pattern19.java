
public class Pattern19 {
	public static void main(String[] args) {
		int n = 7;
		int row = 0;
		int nst = n/2;
		int nsp = 0;
//part1
		while (row < n/2+1) {
			int cst = 0;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			int csp = 1;
			while (csp < nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst2 = 0;
			if (row == 0) {
				cst2 = 1;
			}
			while (cst2 <= nst) {
				System.out.print("*");
				cst2++;
			}
			row++;
			nst--;
			nsp = nsp +2;
			System.out.println();
			}
		// part2
		int row2 = 0;
		int nst2 = 0;
		int nsp2 = n / 2;

		while (row2 < n / 2) {
			int cst = 0;
			while (cst < nst2 + 2) {
				System.out.print("*");
				cst++;
			}
			int csp = 0;
			while (csp < nsp2) {
				System.out.print(" ");
				csp++;
			}
			int cst2 = 0; 
			if (row2 == n/2-1) {
				cst2 = 1;
			}
			while (cst2 < nst2 + 2) {
				System.out.print("*");
				cst2++;
			}
			row2++;
			nsp2 = nsp2 - 2;
			nst2++;
			System.out.println();
		}
	}
}