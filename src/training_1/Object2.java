package training_1;

public class Object2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sg = "Tramped";
		String mg = new String("Moran");// creating new String using new keyword
		String together = sg + " " + mg;
		System.out.println(together);

		char s = sg.charAt(5);
		System.out.println(s);

		int s1 = sg.indexOf("p");// data int because it will return number of index
		System.out.println(s1);

		System.out.println(sg.substring(0, 5));

	}

}
