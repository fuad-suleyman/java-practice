package day27_arrays_05;

import java.util.Scanner;

public class WarmUpTask {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		
		int [] time1= {scan.nextInt(),scan.nextInt()};
		
		int [] time2= {scan.nextInt(),scan.nextInt()};
		
		if(time1[0]>time2[0]) {System.out.println("Time2 is earlier");}else
			if(time1[0]==time2[0]&&time1[1]>time2[1]) {System.out.println("Time2 is earlier");}else 
				if(time1[0]==time2[0]&&time1[1]==time2[1]) {System.out.println("equal times");}else
				{System.out.println("Time1 is earlier");}
	}

}
