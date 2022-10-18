
public class Pattern22 {
	public static void main(String[] args) {
		int n = 5;
		int row = 0;
		int nst = n;
		int nsp = 0;
        int nst2 = n-1;
		while (row < n) {
			int cst = 0;
			int csp = 0;
			int cst2 = 0;
			while (cst < nst) {
				System.out.print("*");
				cst++;
			}
			while (csp+1 < nsp) {
				System.out.print(" ");
				csp++;
			}
			if (row == 0) {
				cst2 = 1;
			}
			while (cst2 < nst) {
				System.out.print("*");
				cst2++;
			}
			row++;
			nst--;
			nsp = nsp + 2;
			System.out.println();
		}

	}
}
