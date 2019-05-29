package day42_custom_classes_03;

import java.util.*;
public class StringShoesToObject {

	public static void main(String[] args) {
		String data="bruno Magli, 9.5";
		String arr [] =data.split(",");
		
		Shoes newShoes= new Shoes();
		newShoes.brand=arr[0];
		newShoes.size=Double.valueOf(arr[1]);  
		System.out.println(newShoes.getShoesData());
		
		
		
		Scanner scan =new Scanner(System.in);
		System.out.println("What shoes brand?");
		String brand=scan.next();
		System.out.println("What is your size?");

		double size=scan.nextDouble();
		
		Shoes shoes= new Shoes();
		
		shoes.setShoesData(brand, size);
		System.out.println(shoes.getShoesData());
		
		
		
		
	}
}
