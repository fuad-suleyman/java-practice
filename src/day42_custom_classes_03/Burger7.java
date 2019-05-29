package day42_custom_classes_03;

public class Burger7 {
	public static void main(String[] args) {

		Burger burger1 = new Burger();
		burger1.name = "COWBOY";
		String[] ings = { "onion crisps", "american cheese", "pickles", "lettuce", "b7 sauce" };
		burger1.ingredients = ings;
		
		System.out.println(burger1.ingredients[0]);
		
		for(String word: burger1.ingredients) {
			System.out.println(word);
		}
	}
}