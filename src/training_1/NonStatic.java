package training_1;

public class NonStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NonStatic obj = new NonStatic();
		obj.substraction();
		obj.profit(150000, 10000, "Jan");

	}

	public int profit(int income, int expense, String month) {

		int profitOfcompany = income - expense;
		System.out.println("This is the profit of the company....  " + month + "=" + profitOfcompany);
		return profitOfcompany;
	}

	public void substraction() {
		int ab = 400;
		System.out.println(ab);
		int ba = 400 - 300;
		System.out.println(ba);

	}

	public NonStatic() {
		System.out.println("this is default constructor");
	}

}
