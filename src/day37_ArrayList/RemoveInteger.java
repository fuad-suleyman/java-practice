package day37_ArrayList;

import java.util.ArrayList;

public class RemoveInteger {

	

	public static void main(String[] args) {
		
		int a=5;
		int b=6;
		int max=Math.max(a, b);
		int min=Math.min(a, b);
		System.out.println("Min: "+min);
		System.out.println("Max: "+max);
		ArrayList<Integer> nums = new ArrayList<>();
		System.out.println(nums.size());
		System.out.println(nums.isEmpty());
		System.out.println(nums.size() == 0);
		
		nums.add(4);
		nums.add(1);
		nums.add(443);
		nums.add(5);
		nums.add(10);
		nums.add(100);
		nums.add(55);
		
		nums.remove(5);
		System.out.println(nums);
		
		Integer n1=new Integer(5);
		nums.remove(n1);
		
		System.out.println(nums);
	}
}
