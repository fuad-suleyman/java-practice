package day22;

import java.util.Scanner;

public class Monthes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner (System.in);
		int month=0;
		do {
			System.out.println("Enter month");
			month=scan.nextInt();
			month++;
			
		}while(month>0&&month<13);

	}

}
