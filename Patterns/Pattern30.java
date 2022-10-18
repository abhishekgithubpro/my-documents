
public class Pattern30 {
	public static void main(String[] args) {
		int n = 5;
		int row = 0;
		int nsp = n-1;
		int nst = 1;
		int nrow = 1;
		while (row < n) {
			int csp = 0;
			while (csp < nsp) {
				System.out.print(" \t");
			csp++;
			}
			nsp--;
			int cst = 0;
			while (cst < nst) {
				if (cst == 0 || cst == nst-1) {
					System.out.print(nrow+"\t");
				}else {
					System.out.print("0"+"\t");	
				}
			cst++;
			}
			nst = nst + 2;
			nrow++;
			row++;
			System.out.println();
		}
	}
}
