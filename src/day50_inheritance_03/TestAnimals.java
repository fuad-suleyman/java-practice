package day50_inheritance_03;

public class TestAnimals {

	public static void main(String[] args) {

		Animal anm = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Duck duck = new Duck();

		anm.speak();
		cat.speak();
		dog.speak();
		duck.speak();
		
		System.out.println("#########################");
		
		anm.move(100);
		cat.move(15);
		dog.move(20);
		duck.move(25);
	}

}
