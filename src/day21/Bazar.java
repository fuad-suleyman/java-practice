package day21;

import java.util.Scanner;

public class Bazar {
public static void main(String[] args) {
	
	
	String items="";
	String newItem="";
	
	double price=0;
	double newPrice=0;
	Scanner scan = new Scanner (System.in);
	
	System.out.println("How many items are you purchasing?");
	int count=scan.nextInt();
	
	for (int i=1; i<=count; i++) {
		System.out.println("What is item "+i);
		newItem=scan.next();
		System.out.println("How much is "+newItem);
		newPrice=scan.nextDouble();
		
	items+=" ,"+newItem;	
	price+=newPrice;
	}
	System.out.println("Your items: "+items);
	System.out.println("Your total price: "+price);
}
}
