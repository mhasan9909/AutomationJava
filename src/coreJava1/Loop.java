package coreJava1;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= 5; i++) {// outer condition
			// i=1, i<10 is true
			// i=2, i<10 is true, increase by 1
			// i=3, i<10 is true

			for (int j = 0; j <= i; j++) {// inner condition
				// j=1, j(1)<=i(1) is true, increase by 1
				// j=2, j(2)<=i(1) is false
				// 1 will print

				// j=1, j(1)<=i(2) is true, increase by 1
				// j=2, j(2)<=i(2) is true, increase by 1
				// j=3, j(3)<=i(2) is false
				// 12 will print

				// j=1, j(1)<=i(3) is true, increase by 1
				// j=2, j(2)<=i(3) is true, increase by 1
				// j=3, j(3)<=i(3) is true, increase by 1
				// j=4, j(4)<=i(3) is false
				// 123 will print

				System.out.print(i + j);

			}
			System.out.println();

		}
	}

}
