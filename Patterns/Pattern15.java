import java.util.Scanner;

public class Pattern15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nsp = 0;
		int row = 0;
		int nst = n;
		while (row < n * 2 - 1) {
			int csp = 0;
			while (csp < nsp) {
				System.out.print(" ");
				csp++;
			}row++;
			int cst = 0;
			while (cst < nst) {
				System.out.print("*");
				cst++;
			}
			
			if (row < n) {
				nsp = nsp + 2;
				nst--;
			} else {
				nsp = nsp - 2;
			    nst++;
			}
			System.out.println();
		}

	}
}