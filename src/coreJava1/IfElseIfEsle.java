package coreJava1;

public class IfElseIfEsle {

	public static void main(String[] args) {
		// string length

		String pp = "peoplentech";

		if (pp.length() > 5 && pp.length()<5) {
			System.out.println("size is greater than 5");
		} else if (pp.length() > 10) {
			System.out.println("size is greater than 10");
		} else if (pp.length() > 15) {
			System.out.println("size is greater than 15");
		} else {
			System.out.println("nothing");
		}

	}

}
