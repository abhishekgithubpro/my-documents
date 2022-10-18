import java.util.Scanner;

public class Pattern7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 0;
		int nst = n;
		while (row < n) {
			int cst = 0;
			while (cst < nst) {
				if (row == 0 || row == n-1 || cst == 0 || cst == n-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				cst++;
			}	row++;
			System.out.println();	
			
		}
	}
}