package day41_customclasses_02;

public class MyCars {

public static void main(String[] args) {
	
	Car car1=new Car();
	
	car1.model="E450";
	car1.color="Gray";
	car1.make="Mercedes";
	car1.currentSpeed=70;
	
	car1.printCarInfo();
	
	car1.accellerate(-30);
	
	car1.showCurrentSpeedLimit(55);
	
	car1.drive();
	
	BMW bmw =new BMW();
	bmw.model="m3";
	bmw.showPrice();
	
	
	
}
	
}
