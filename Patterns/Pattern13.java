import java.util.Scanner;

public class Pattern13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 0;
		int nst = 1;
		while (row < n * 2 - 1) {
			int cst = 0;
			while (cst < nst) {
				System.out.print("*");
				cst++;
			}
			row++;
			if (row < n) {
				nst++;
			} else {
				nst--;
			}
			System.out.println();
		}
	}
}