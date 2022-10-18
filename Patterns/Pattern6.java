import java.util.Scanner;

public class Pattern6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 0;

		while (i < n) {
			int csp = 0;
			int cst = n - 1;
			while (csp <= i * 2 - 1) {
				System.out.print("  ");
				csp++;
			}
			while (cst > i) {
				System.out.print("* ");
				cst--;
			}

			System.out.println();
			i++;
		}
	}
}