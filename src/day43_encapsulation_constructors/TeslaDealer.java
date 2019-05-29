package day43_encapsulation_constructors;

public class TeslaDealer {
	
	public static void main(String[] args) {
		Tesla tesla=new Tesla();
		tesla.setModel("Camry");
		tesla.setRange(310);
		tesla.setZeroTo60(3.2);
		tesla.setPrice(51450);
		tesla.setSelfDriving(true);
		
		System.out.println("Model: "+tesla.getModel());
		System.out.println("Range: "+tesla.getRange());
		System.out.println("0 to 60: "+tesla.getZeroTo60());
		System.out.println("Price: $"+tesla.getPrice());
		System.out.println("selfDriving: "+tesla.isSelfDriving());
		
		System.out.println(tesla);
		
		
		System.out.println(tesla.isValidModel("Model X"));
		
		
		Tesla myTesla= new Tesla(); 
		
		myTesla.setTeslaInfo("roadster", 620, 1.9, 250, true);
		System.out.println(myTesla);
		
		
		
		System.out.println(Math.max(tesla.getZeroTo60(), myTesla.getZeroTo60()));
		
		buy(myTesla);
		
		System.out.println(testDrvive("Model S"));
	}
	
		public static void buy(Tesla car) {
			System.out.println("Purchasing: "+car.toString());
		}
	

		public static Tesla testDrvive(String model) {
			System.out.println("Hi i'd like to test drive - "+model);
			System.out.println("Sure let me build the object and return it");
			Tesla car=new Tesla();
			
			car.setTeslaInfo(model,310,2.5,95000.0,false);
			return car;
			 
		}
	
}
