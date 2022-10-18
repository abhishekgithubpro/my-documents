import java.util.Scanner;

public class Pattern11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 0;
		int nsp = n - 1;
		int nst = 0;
		while (row < n) {
			int csp = 0;
			while (csp < nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 0;
			while (cst <= nst) {
				if (cst % 2 == 0)
					System.out.print("*");
				else
					System.out.print(" ");
				cst++;
			}
			row++;
			nsp--;
			nst = nst + 2;
			
			System.out.println();
		}
	}
}