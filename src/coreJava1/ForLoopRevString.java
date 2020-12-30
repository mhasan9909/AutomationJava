package coreJava1;

public class ForLoopRevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String bd="Bangladesh";
		
		for(int i=bd.length()-1; i>=0; i--) {
			System.out.print(bd.charAt(i));
		
		}
		System.out.println();
		
		for(int j=0; j<bd.length(); j++) {
			System.out.print(bd.charAt(j));
		}

	}

}
