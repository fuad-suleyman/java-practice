package day52_inheritance_05;
import java.util.Arrays;
public class FinalArrays {
	
	public static void main(String [] args) {
		final int [] TEAMS = {11,11};
		
		System.out.println("Team1: "+TEAMS[0]);
		System.out.println("Team2: "+TEAMS[1]);
		
		TEAMS[0]=10;
		TEAMS[1]=9;
		
		System.out.println("Team1: "+TEAMS[0]);
		System.out.println("Team2: "+TEAMS[1]);
		
		int [] nums= {12,18,1548};
		System.out.println(Arrays.toString(nums));
		
		nums=new int []{2,3,3,42,356};
		System.out.println(Arrays.toString(nums));
		
		final int [] finalNums= {21,3,76,4};
		System.out.println(Arrays.toString(finalNums));
		finalNums[0]=85;
		System.out.println(Arrays.toString(finalNums));
		//finalNums=new int [] {54,656,5};
		
		final double [] PRICES= new double [3];
		PRICES[0]=85.5;
		PRICES[1]=99.99;
		PRICES[2]=99.98;
		
		System.out.println(Arrays.toString(PRICES));
		PRICES[0]=81.1;
		System.out.println();
				
		
	}

}
