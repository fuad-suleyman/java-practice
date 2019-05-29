package day52_inheritance_05;

public class Computer {

	private String model;
	private String color;
	


public boolean equals(Computer other) {
	
	if(this.model.equals(other.model)&&this.color.equals(other.color)) {return true;}
	return false;
}
	
	

	public Computer() {
		
	}
	
	public Computer(String model, String color) {
		this.model=model;
		this.color=color;
	}
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
