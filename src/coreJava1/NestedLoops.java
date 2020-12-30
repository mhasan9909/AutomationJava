package coreJava1;

public class NestedLoops {

	public static void main(String[] args) {
		// pyramid style

		for (int a = 1; a < 5; a++) {
			for (int c = 5; c > a; c--) {
				System.out.print(" ");

			}
			for (int b = 0; b < a; b++) {
				System.out.print("" + a + b);
			}

			System.out.println();

		}

	}

}
