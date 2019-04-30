package day34_methods_06;

import java.util.Arrays;
import java.util.Random;

public class CountArray {
	public static int findOccurences(int [] array, int value) {
		int counter=0;
		for (int i=0; i<array.length; i++) {
			if(array[i]==value) {counter++;}
		}
	
		
		return counter;
	}
	
	public static int[] getArray() {
		int [] arr= {1,2,4,5};
		
		
		return arr;
	}
	
	public static int[] getRandomArray(int size) {
		Random random = new Random(100);
		int [] counts=new int [size];
		for(int i=0; i<size; i++) {
			counts[i]=random.nextInt(100);
		}
		
		return counts;
	}

	

public static void main(String[] args) {
	
	System.out.println(findOccurences(new int []{1,1,2,5,1,9},1));
	
	System.out.println();
	int [] nums = {10,5,44,6,8,1,4,1,6};
	int count=findOccurences(nums, 1);
	
	System.out.println(count);
	
	System.out.println(findOccurences(nums, 4));
	System.out.println("**********************************");
	
	
	int[] myArr=getArray();
	System.out.println(Arrays.toString(myArr));
	
	
	System.out.println(Arrays.toString(getRandomArray(10)) );
}
}
