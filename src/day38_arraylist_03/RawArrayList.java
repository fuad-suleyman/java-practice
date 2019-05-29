package day38_arraylist_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RawArrayList {
	
	public static void main(String[] args) {
		
		
		ArrayList list= new ArrayList ();
		list.add("Saturday");
		list.add("Java day");
		list.add(1000);
		list.add(234.4);
		list.add(true);
		list.add(false);
		System.out.println(list);
		String allValues=list.toString();
		System.out.println(allValues);
		
		boolean str=list.get(0).equals("kjhk");
		
		List<String>letters=Arrays.asList("a","b","c"); 
	
		
	}
	
}
