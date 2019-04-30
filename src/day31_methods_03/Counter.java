package day31_methods_03;
import java.util.*;
public class Counter {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("enter number");
		int s=scan.nextInt();
		
		 if (s<1) {System.out.println("invalid input");
	}
		
		countUp(s);
		
		System.out.println();
		
		countDown(s);

		
	}

	
	public static void countDown(int num) {
		
		
		
		for (int i=num; i>0; i--) {
			
			
			System.out.print(i+" ");
		}
		
		
	}
	public static void countUp(int num) {
		
		
		
		for (int i=1; i<=num; i++) {
			
			
			System.out.print(i+" ");
		}
	}
}
