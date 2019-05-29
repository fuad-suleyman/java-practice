package day51_inheritance_04;

public class Snowboarding extends Exercise {

	public int perform (int minutes) {
	int cal=super.preform(10);
		
		System.out.println("Snowboarding for "+minutes+" minutes");
		return minutes*7+cal;
	}
}
