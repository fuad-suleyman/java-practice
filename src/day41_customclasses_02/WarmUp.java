package day41_customclasses_02;
import java.util.*;
public class WarmUp {
	
	public static List<Integer> doubleThelist(List<Integer>nums){
	
		for(int n=0; n<nums.size(); n++) {
			nums.set(n, nums.get(n)*2);
		}
	
return nums;
		
	}
	
	public static void main(String[] args) {
		ArrayList<Integer>nums=new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(5);
		nums.add(10);
		
		System.out.println(doubleThelist(nums));
	}
}
