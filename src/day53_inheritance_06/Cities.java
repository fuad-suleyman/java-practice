package day53_inheritance_06;

public class Cities{
	
	public static void main(String[] args) {
		
		City baku= new City(123, "Baku");
		System.out.println(baku.toString());
		
		City istanbul= new City(44, "Istanbul");
		City anotherCity= new City(44, "Istanbul");
		
		if(istanbul.equals(anotherCity)) {
			System.out.println("Both are istanbul");
		}else {
			System.out.println("They are not same");
		}
		
		
		System.out.println(baku.hashCode());
		System.out.println(istanbul.hashCode());
		System.out.println(anotherCity.hashCode());
	}
	
	

}
