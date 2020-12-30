package training_1;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Java is fun";
		String b = "java is fun";
		String e = "I don't find neither of them";
//		char c=a.charAt(5);//find the index number
//		System.out.println(c);
//		int d=a.indexOf(" ");
//		System.out.println(d);
//		String d=a.substring(1, 9);
//		System.out.println(d);
//		String ab=a.concat(" "+b).concat(" "+e);//concate two or more strings
//		System.out.println(ab);
//		System.out.println(a.length());
//		a.trim();
//		System.out.println(a.toUpperCase());
//		System.out.println(a.toLowerCase());
//		

//		boolean bo=a.startsWith("J");
//		System.out.println(bo);
//		boolean eq=a.equals(b);
//		System.out.println(eq);
		boolean icase = a.equalsIgnoreCase(b);
		System.out.println(icase);

	}

}
