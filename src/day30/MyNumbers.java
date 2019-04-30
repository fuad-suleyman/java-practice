package day30;
import  java.util.*;
public class MyNumbers {
	public static void main(String[] args) {
		showme5Numbers();
		showme5Numbers();
		showme5Numbers();
		showme5Numbers();
		showme5Numbers();
		
		System.out.println("************************");
		
		do10PushUps();
		System.out.println("************************");
		rengePrint();
	
		}
		


	
	
	public static void showme5Numbers() {
		
		Random random= new Random();
		for(int i=1; i<=20; i++) {
		int num= random.nextInt(1000);
		System.out.print(num+", ");}
		System.out.println();
	}
	
	public static void do10PushUps() {
		for (int i=1; i<11; i++ ) {
			
			System.out.println("Pushup -  "+i);
		}
		System.out.println("Time to rest!");
	} 
	
	public static void rengePrint() {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter 2 numbers");
		int num1= scan.nextInt();
		int num2= scan.nextInt();
		
		if (num1>num2) {
			int count =num1;
			while(count<=num1) {
				System.out.print(count+" ");
				
				
				count--;
				if (count<num2) {break;
					}
			}
		}
		
		if (num2>num1) {
			int count =num1;
			while(count<=num2) {
				System.out.print(count+" ");
				count++;
			}
		}
		
		if(num1==num2) {
			System.out.println(num2);
		}
		
	}
	
	
}
