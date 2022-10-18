
public class HCFAndLCM {

	public static void main(String[] args) {
		int a = 18;
		int b = 34;

		int div = a;
		int dev = b;

		while (div > 0) {
			int rem = dev % div;
			dev = div;
			div = rem;
		}
		System.out.println(dev);
	}

}
