
public class Pattern28 {
	public static void main(String[] args) {
		int n = 5;
		int row = 0;
		int nsp = n - 1;
		int nst = 0;
		while (row < n) {
			int csp = 0;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			nsp--;
            int srn = row+1;
			int cst = 0;
			while (cst <= nst) {
				System.out.print(srn);
				if (cst < nst / 2) {
					srn++;
				} else {
					srn--;
				}
				cst++;
			}
			nst = nst + 2;
			srn++;
			row++;
			System.out.println();
		}
	}
}
