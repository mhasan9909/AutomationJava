package training_1;

public class Object1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 33;
		int y = 11;
		Object1 ov = new Object1();
		ov.addition(x, y);
		ov.minus(x, y);

//		one way we run the minus method by declaring the variable like
//		int m=x-y;
//		System.out.println(m);
//		or we can create object

//		OverLoading ob=new OverLoading();
//		ob.minus(x, y);

	}

	public void addition(int x, int y) {
		int add = x + y;
		System.out.println("x plus y = " + add);
	}

	public void minus(int x, int y) {
		int minus = x - y;
		System.out.println("x minus y = " + minus);

	}

}
