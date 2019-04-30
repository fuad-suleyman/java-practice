package day23_arrays_and_loops;

import java.util.Scanner;

public class WarmupTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Provide your number");
		int num=scan.nextInt();
		
		String prime="is not a prime number";
		
		for (int i=1; i<=num; i++) {
			
			if(num%i==0&& i!=1&&i!=num)	{
		prime="is not a prime number";
			}else 
			{prime= "is a prime number";}
		}
			System.out.println(num+" "+prime);
	}

}
