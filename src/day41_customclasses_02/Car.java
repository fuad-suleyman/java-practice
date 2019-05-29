package day41_customclasses_02;

public class Car {
	String make;
	String model;
	int currentSpeed;
	String color;
	
	
	public void printCarInfo() {
		System.out.println("car make ["+make+"], model ["+model+"], color ["+color+"], currentSpeed ["+currentSpeed+"]");
	}

	public void showCurrentSpeedLimit(int speedLimit) {
		if(currentSpeed<=speedLimit) {System.out.println(model+" is driving at "+currentSpeed+" mph, following speed limit 55");}
		if(currentSpeed>speedLimit) {System.out.println(model+" is driving at "+currentSpeed+" mph, over speed limit 55");}
	}
	
	public void drive() {
		System.out.println(make+" "+model+ " is driving...");
	}
	
	public void accellerate(int mph) {
		currentSpeed+=10;
	} 
}
