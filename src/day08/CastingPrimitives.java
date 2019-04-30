package day08;

public class CastingPrimitives {
	public static void main(String[] args) {
		int i=(int) 3.4;
		System.out.println("i: "+i);
		
		
	double price=230.5;
	int dollars=(int) price;
	
	double a=5;
	
	System.out.println("Price "+ price);
	System.out.println("Dollars "+dollars);
	System.out.println(a);
	System.out.println(""
			+ "");
	
	int count=44;
	byte byteCount=(byte) count;
	System.out.println("Bytecount: "+byteCount );
	
	  int result =(int) 500.4/ (int)2.0;
	  
	  System.out.println("result: "+result);
	   
	}

}
