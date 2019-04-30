package day27_arrays_05;
import java.util.*;
public class CopyOf2 {

	public static void main(String[] args) {
		
		int nums[]= {35,56,23,1,55};
		
		int [] nums2=Arrays.copyOf(nums,nums.length+2);  // copy array num and add to more space
		
		int [] nums3 = Arrays.copyOfRange(nums,1,3);
		
		System.out.println(Arrays.toString(nums2)); // if it is not assigned it prints 0 instead of empty values
		
		System.out.println(Arrays.toString(nums3));
		
		int brandNew []= {34,23,54,23};
		System.out.println("Length before: "+brandNew.length);
		
		brandNew=Arrays.copyOf(brandNew, brandNew.length+5); System.out.println();
		
		System.out.println("Length after: "+brandNew.length);
		
	}
}
