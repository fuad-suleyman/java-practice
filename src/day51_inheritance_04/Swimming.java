package day51_inheritance_04;

public class Swimming extends Exercise {

	public int perform (int minutes) {
		System.out.println("Swimming");
		return minutes*11;
	} 

}
