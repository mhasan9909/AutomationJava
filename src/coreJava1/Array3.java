package coreJava1;

public class Array3 {

	public static void main(String[] args) {
		// find out minimum number from this Array
		int number[] = { -3, -13, 12, 1, 0, -9, 2 };

		int min = number[0];
		int max = number[0];

		for (int i = 0; i < number.length; i++) {

			if (number[i] < min) {
				min = number[i];
			}

			if (number[i] > max) {
				max = number[i];
			}

		}
		System.out.println(min);
		System.out.println(max);

	}
}
