package day27_arrays_05;
import java.util.*;
public class ArrayClass {
public static void main(String[] args) {
	
	int nums [] = {43,12,4,1,3,5};
	int a = Arrays.binarySearch(nums, 43);
	//Binary search
	
	System.out.println(a);
	
	//toString method
	
	System.out.println(Arrays.toString(nums));
	
	Arrays.sort(nums);
	System.out.println(Arrays.toString(nums));
	
	String [] languages= {"Zulu", "Spanish", "Itanlian", "English", "Polish", "Arabic", "Uzbek"};
	Arrays.sort(languages);
	
	System.out.println(Arrays.toString(languages));

	
	int [] nums2= {345,665,3333,11,3,66};
	
	System.out.println(Arrays.toString(nums2));
	
	Arrays.sort(nums2);
	
	System.out.println(Arrays.toString(nums2));
	
	
	
	
	
}
}
