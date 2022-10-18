import java.util.Scanner;

public class primeFactorization {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int div = 2;
		while (n != 1) {
			if (n % div == 0) {
				n = n / 2;
				System.out.println(div);
			} else {
				div++;
			}
		}
	}

}
