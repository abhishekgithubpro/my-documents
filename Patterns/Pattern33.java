
public class Pattern33 {

	public static void main(String[] args) {
		int n = 10;
		int row = 0;
		int nsp = n - 1;
		int nst = 0;
		int var = n;
		while (row < n) {
//			int csp = 0;
//			while (csp < nsp) {
//				System.out.print("  ");
//				csp++;
//			}
//			nsp--;

			int cst = 0;
			while (cst <= nst) {
				if (var != 10) {
					System.out.print(var + " ");
				} else {
					System.out.print("0" + " ");
				}
				if (cst < nst / 2) {
					var++;
				} else {
					var--;
				}
				cst++;
			}
			nst = nst + 2;
			row++;

	 		System.out.println();

		}
	}

}
