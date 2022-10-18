import java.util.Scanner;

public class Pattern10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 0;
		int nst = n * 2 - 1;
		int nsp = 0;
		while (row < n) {
			int csp = 0;
			while (csp < nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 0;
			while (cst < nst) {
				System.out.print("*");
				cst++;
			}
			nst = nst - 2;
			row++;
			nsp++;
			System.out.println();
		}
	}
}