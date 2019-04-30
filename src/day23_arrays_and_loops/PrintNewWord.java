package day23_arrays_and_loops;

import java.util.Scanner;

public class PrintNewWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner scan= new Scanner (System.in);
		String total="";
		int num=scan.nextInt();
		for (int i=1; i<=50; i++) {
			
			if (i%20==0) {
				break;
			}
			
			if(i%5==0&&i%20!=0) {
				
				
				continue;
			}
			
			total+=i+",";
			
		}
		System.out.println(total.substring(0,total.length()-1));
	}

}
