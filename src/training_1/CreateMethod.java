package training_1;

public class CreateMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		substraction();
//		addition();

		int profitBeforeTax = profit(120000, 20000, "Jan");
		System.out.println("Profit Before Taxes =" + profitBeforeTax);

		profit(120000, 20000, "Jan");
		profit(90000, 20000, "Feb");
		profit(20000, 20000, "March");
		profit(1120000, 20000, "April");

	}
//	public static void substraction() {
//		int ab=400;
//		System.out.println(ab);
//		int ba=400-300;
//		System.out.println(ba);
//	}
//		
//		public static void addition() {
//			int ab=400;
//			System.out.println(ab);
//			int ba=400+300;
//			System.out.println(ba);

//   			public static void profit(int income, int expense, String month) {
//   				
//   				int profitOfcompany=income-expense;
//   				System.out.println("This is the profit of the company....  " +month +"="+profitOfcompany);
//   				

	// }
	public static int profit(int income, int expense, String month) {

		int profitOfcompany = income - expense;
		System.out.println("This is the profit of the company....  " + month + "=" + profitOfcompany);
		return profitOfcompany;

	}

}
