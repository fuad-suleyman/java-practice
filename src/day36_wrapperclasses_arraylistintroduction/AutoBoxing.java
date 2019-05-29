package day36_wrapperclasses_arraylistintroduction;

public class AutoBoxing {

	public static void main(String[] args) {
		
		Integer num1=1234;
		
		int n=5;
		
		Integer num2=n; // Autoboxing is converting from PRIMITIVE to WRAPPER CLASS OBJECT
		
		Double d1=new Double (34.2);
		double d2=d1;	// Unboxing converting from WRAPPER CLASS to PRIMITIVE
				
		System.out.println("d1: "+d1);
		System.out.println("d2: "+d2);
		
		
		long l1=new Long (6000000);//unboxing 
		long l2=new Long (3445484845L);// no boxing 
		long l3=l2; // unboxing
		Long l4=l3; // autoboxing
		
		
		
		
		
	}
}
