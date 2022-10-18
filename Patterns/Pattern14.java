import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 0;
		int nsp = 0;
		int nst = 0;
		while (row < n * 2 - 1) {
			int csp = n-1;
			int cst = 0;
			while (csp >= nsp) {
				System.out.print(" ");
				csp--;
			}
			while (cst <= nst) {
				System.out.print("*");
			cst++;
			}
			row++;
			if (row < n) {
				nst++;
				nsp++;
			} else {
				nst--;
				nsp--;
			}
			
			System.out.println();

		}
	}

}