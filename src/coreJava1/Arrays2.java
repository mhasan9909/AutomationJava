package coreJava1;

public class Arrays2 {

	public static void main(String[] args) {
		// find out the positive and negative and zero
		int number[]= {-3,-13,12,1,0,-9,2};
		String name[]= {"John", "Isac", "Philips", "Morris", "Adam"};
		for(int i=0; i<number.length; i++) {
			if(number[i]>0){
				System.out.println("this "+number[i]+" is positive number");
			}else if(number[i]==0){
				System.out.println("this "+number[i]+" is ZERO");
		}else{
			System.out.println("this "+number[i]+" is negative number");

	}
		}
	}
}
