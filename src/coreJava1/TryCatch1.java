package coreJava1;

public class TryCatch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try{
       char[]a= {'P','e','o','p','l','e'};
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		
		for(int j=a.length+1; j>=0; j++) {
			//(int j=a.length-1; j>=0; j--)
			System.out.print(a[j]);

	}
		}catch(Exception e){
			System.out.println("failed");
		}
	}

}
