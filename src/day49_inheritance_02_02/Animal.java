package day49_inheritance_02_02;

public class Animal {

	String type;
	
	public Animal() {
		System.out.println("Animal constructor");
	}
	
	public Animal(String type) {
		System.out.println("Animal 1 arg constructor");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
}
