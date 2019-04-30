package day24_arrays;

public class CarShop {

	public static void main(String[] args) {
		
		// BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, Tesla
		
String [] cars= { "BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla"};
		
	/*	for(String car:cars) {
			if(car.startsWith("M")) {
				System.out.println(car);
			}
		}*/

	/*	int i=0;
		
		while(i<cars.length) {
			
			if(cars[i].toUpperCase().contains("R")){
				System.out.println(cars[i]);
				
				}
			i++;
			}*/
		
		
		int z=cars.length-1 ;
		while (cars.length>z&&z>=0) {
			System.out.println(cars[z]);
			z--;
		}
	}
}
