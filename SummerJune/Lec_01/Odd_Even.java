package Lec_01;

public class Odd_Even {
	public static void main(String[] args) {
		int num = 13;
		int rem = num % 2;
		if (0 == rem) {
			System.out.println("EVEN");
		} 
		else {
			System.out.println("ODD");
		}
		System.out.println("end");
	}
}
