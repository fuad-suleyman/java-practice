package day42_custom_classes_03;

public class MyCoffees {
	public static void main(String[] args) {
		
		Coffee coffee=new Coffee();
		
		coffee.name="iced caramel machiato";
		coffee.size="GRANDE";
		coffee.price=4.75;
		coffee.calories=250;
		
		coffee.getCoffeInfo();
		
		Coffee coffee2=new Coffee();
		
		coffee2.setName("JAVA CHIP");
		coffee2.size="VENTI";
		coffee2.price=5.95;
		coffee2.calories=600;
		coffee2.getCoffeInfo();
		
		
		
		Coffee coffee3=new Coffee();
		coffee3.setName("ICED COFFEE");
		coffee3.setSize("TALL");
		coffee3.setPrice(2.45);
		coffee3.setCalories(60);
		
		coffee3.getCoffeInfo();
		

		Coffee coffee4=new Coffee();
		coffee4.setCoffeeInfo("FLAT WHITE", "TALL", 3.95, 170);
		coffee4.getCoffeInfo();

	}
	
		
}
