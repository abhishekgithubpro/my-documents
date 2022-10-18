
public class fabonacci {
	public static void main(String[] args) {
		int n = 10;
		int i = 0;
		int a = 0;
		int b = 1;

		while (i <= n) {
			int sum = a + b;
			System.out.println(a);
			a = b;
			b = sum;
			i++;
		}
	}
}
