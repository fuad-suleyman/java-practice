package day41_customclasses_02;

public class Microwave {
	String brand;
	String food;
	boolean isOn;
	 
	
	
	public void turnOn() {
		System.out.println(brand+ " Turning on "+brand +" microwave...");
		if(isOn==true) {System.out.println(brand+"I t is already on.");}else 
			if(isOn==false) {System.out.println("We just turned on"); isOn=true;}
		
	}
	
	
	
	public void turnOff() {
		if(isOn==true) {System.out.println("Turning off "+brand + " "
				+ "microwave..."); isOn=false;}else 
			if(isOn==false) {System.out.println(brand+" It is already off"); }
	}
	
	
	public void heat() {
		if(isOn==true) {System.out.println("Heating the "+food);}else
			if(isOn==false) {System.out.println("Can not heat the "+food+" Microwave is off");}
	}
	
	
	
}
