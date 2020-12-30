package coreJava1;

public class PyramidLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 15; i++) {
			for (int j = 15; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print(" *");
			}
			System.out.println();

		}
	}

}
