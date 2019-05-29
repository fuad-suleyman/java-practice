package day39_ArrayList_04;

import java.util.*;
public class UniqueValues {

	
	public static void main(String[] args) {
		
		List <Integer>nums= new ArrayList<>();//-->polimorphizim
		nums.add(10);	nums.add(10);
		nums.add(7);	nums.add(8);
		nums.add(8);	nums.add(3);
		nums.add(8);	nums.add(4);
		
		List<Integer>uniqueList=new ArrayList<>();
		
		for(int i=0; i<nums.size(); i++) {
			boolean uni=true;
			for(int k=0; k<nums.size(); k++) {
				if(nums.get(i)==nums.get(k)&&i!=k) {
					uni=false;
					
				}
				
			}
			if(uni==true) {uniqueList.add(nums.get(i));}
		}
		
		System.out.println(uniqueList);
		
		CustomListMethods.printList(nums);
		
		
		
	}
}
