package coreJava1;

public class ForLoopSum {

	public static void main(String[] args) {
		//find out sum of 1 to 50
		//1+1=1, 1+2=3, 3+3=6, 4+6=10.......
		int sum=0;
		
		for(int j=1; j<=50; j++) {
			sum=sum+j;
			System.out.println("here is the j value >> "+j+" << sum of 1 to " +j+ " is :: "+sum);
		}
		
		System.out.println("==================================================================");
		
		int sum1=0;
		
		for(int b=0; b<=100; b=b+2) {
			sum1=sum1+b;
			System.out.println("here is the b value >> "+b+" << sum of 1 to " +b+ " is :: "+sum1);
	
		}

	}

}
