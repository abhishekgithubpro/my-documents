import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 0;
		while (row < n) {
			int col = n;
			while (col > row) {
				System.out.print("*");
				col--;
			}
			row++;
			System.out.println();
		}
	}
}