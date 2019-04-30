package day08;

import java.util.Scanner;

public class IfElseWithScanner {
	public static void main(String[] args) {
		// passing percentage=65
		//yourScorePercentage=take from scanner
		//check if you passed or failed
		
		Scanner scan= new Scanner (System.in);
		
		int passingPercentage=65;
		System.out.println("What is your score");
		int myScore=scan.nextInt();
		
		
		if(myScore>=passingPercentage) {
			System.out.println("congrats!!!");
			
		}else { System.out.println("Next time :((");}
		}
		
	}


