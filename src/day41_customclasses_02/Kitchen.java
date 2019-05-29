package day41_customclasses_02;

public class Kitchen {

	public static void main(String[] args) {

		Microwave mic=new Microwave();
		
		mic.brand="LG";
		mic.turnOn();
		mic.food="Pizza";
		mic.heat();
		mic.turnOff();
		
	}
}
