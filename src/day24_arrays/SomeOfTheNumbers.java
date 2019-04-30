package day24_arrays;

import java.util.Arrays;

public class SomeOfTheNumbers {
	
	public static void main(String[] args) {
		
		//let's create an array of integers with length 3
		
		int[] numbers= new int[3];
		
		numbers[0]=25;	//first value in array
		numbers[1]=10;	//second value in array
		numbers[2]=20;	//third value in array
		
		
		//[I@15db9742 it is a hash code
		
		System.out.println(numbers);
		//to string() from arrays class can help as to print an arrays as string 
		System.out.println(Arrays.toString(numbers));
		
		int sum=0;
		// please use for loop in order to loop through the array
		// calculate the sum of all elements
	
		for (int i=0; i<numbers.length; i++) {
			sum+=numbers[i];			
			}
		System.out.println("Sum: "+sum);
		
		//find the largest value in the array
		
		int max=Integer.MIN_VALUE;
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]>max) {
				max=numbers[i];
			}
		}
		System.out.println("Max value: "+max);
		
		
		// find the minimum value in the arrays
		int min=0;
		min=Integer.MAX_VALUE;
		for (int z=0; z<numbers.length; z++) {
			if(numbers[z]<min) {
				min=numbers[z];
			}
			
		}
		System.out.println("Minimum value: "+min);
		
	}

}
