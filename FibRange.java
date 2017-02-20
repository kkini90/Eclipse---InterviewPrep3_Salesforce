package Salesforce;

public class FibRange {
	static int f1 = 0, f2 = 1, f3 = 0;
	public static void main(String[] args) {
		fibInRange(4, 150);
	}
	private static void fibInRange(int lower, int upper) {
		for (int i = lower; i < upper; i++) {
			if (f3 >= lower && f3 <= upper) {
				System.out.print("\t" + f3);
			}
				f1 = f2;
				f2 = f3;
				f3 = f1 + f2;		
		}
	}
}
