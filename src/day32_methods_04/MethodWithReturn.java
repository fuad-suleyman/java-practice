package day32_methods_04;

import java.util.Arrays;

public class MethodWithReturn {

	public static void main(String[] args) {
		System.out.println(giveMe10$());
		
		int i=giveMe10$(); 
		System.out.println("i: "+ i);
		
		System.out.println(giveMeYourName());
		String name=giveMeYourName();
		System.out.println("My name is "+name);
		
	}
	public static int giveMe10$() {
		return 10;
	}
	
	public static String giveMeYourName() {
		return "Fuad";
	}
}
