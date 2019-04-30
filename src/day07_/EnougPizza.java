package day07_;

public class EnougPizza {

	public static void main(String[] args) {
			//slices in pizz->8
			//slices per student->2
		
		int pizzaCount=50;
		int studentsCount=145;
		
		boolean isEnoughPizza=(pizzaCount*8/studentsCount)>=2;
System.out.println("Is pizza enough? - " +isEnoughPizza);
	}

}
