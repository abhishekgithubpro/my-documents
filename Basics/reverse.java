
public class reverse {

	public static void main(String[] args) {
		int n = 98;
		int val = n;
		int rem = 0;
		int sum = 0;
		while(val!=0) {
			rem = val % 10;
	        sum = sum * 10 + rem;
			val = val/10;
		}System.out.print(sum);
	}

}
