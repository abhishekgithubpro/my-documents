import java.util.Scanner;

public class Pattern16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 0;
		int nst = 0;
		int nsp = 0;
		while (row < n) {
			int cst = n;
			int csp = 0;
			while (cst > nst) {
				System.out.print("*");
				cst--;
			}
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			while (cst > nst) {
				System.out.print("*");
				cst--;
			}
			row++;
			if (row < n / 2) {
				nst--;
				nsp = nsp + 2;
			} else {
				nst++;
				nsp = nsp - 2;
			}
			System.out.println();
		}
	}
}