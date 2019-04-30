package day06_operators_2;

import java.util.Scanner;

public class ScannerYourName {
public static void main(String[] args) {
	System.out.println("Hi, What is your name");
	Scanner scan=new Scanner(System.in);
	
	String FirstName=scan.next();		
			System.out.println("My name is " +FirstName);
			
}

}
