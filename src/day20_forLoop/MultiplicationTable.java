package day20_forLoop;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		
		Scanner scan= new Scanner (System.in);
		
		System.out.println("Enter your number");
		num=scan.nextInt();
		
		
		if(num<1 || num>10) {System.out.println("Invalid data");
		System.exit(0);}
		
		
		
		for (int i=1; i<=10; i++) {
			if (num==1) {System.out.println(1+"x"+i+"="+num*i);}
			if (num==2) {System.out.println(2+"x"+i+"="+num*i);}
			if (num==3) {System.out.println(3+"x"+i+"="+num*i);}
			if (num==4) {System.out.println(4+"x"+i+"="+num*i);}
			if (num==5) {System.out.println(5+"x"+i+"="+num*i);}
			if (num==6) {System.out.println(6+"x"+i+"="+num*i);}
			if (num==7) {System.out.println(7+"x"+i+"="+num*i);}
			if (num==8) {System.out.println(8+"x"+i+"="+num*i);}
			if (num==9) {System.out.println(9+"x"+i+"="+num*i);}
			if (num==10) {System.out.println(10+"x"+i+"="+num*i);}
			
		}

	}

}
