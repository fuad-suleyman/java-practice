package day27_arrays_05;

import java.util.Arrays;

public class CopyOf {
 
	public static void main(String[] args) {
		
		double [] d1 = {2.3, 4.5, 12.4};
		
		double [] d2 = d1;
		
		
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		d1[2]=0.005;
		
		System.out.println("********************");
		
		System.out.println("d1: "+Arrays.toString(d1));
		System.out.println("d2: "+Arrays.toString(d2));
		
		double [] d3=Arrays.copyOf(d2, d2.length);
		
		System.out.println("d3: "+Arrays.toString(d3));
		
	}
}
