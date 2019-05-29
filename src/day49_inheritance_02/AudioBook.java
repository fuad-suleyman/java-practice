package day49_inheritance_02;

public class AudioBook extends Book{

	private double length;
	private String narrator;
	
	public void listen() {
	System.out.println("Listening to "+getTitle()+" by "+getAuthor()+" and narrated by "+getNarrator());	
	}
	
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	
	
	public String getNarrator() {
		return narrator;
	}
	public void setNarrator(String narrator) {
		this.narrator = narrator;
	}
	
	
	
}
