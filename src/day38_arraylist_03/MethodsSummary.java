package day38_arraylist_03;

import java.util.*;

public class MethodsSummary {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("red");
		list.add("blue");
		list.add("white");
		list.add("gray");
		list.add("black");
		//add method with index: yellow will be placed to index 0
		list.add(0,"yellow");
		System.out.println(list);
		
		//toString method to print all values in same line
		System.out.println(list.toString());
		
		
		//size method: return number of values
		System.out.println("Number of elements: "+list.size());
		
		//get method: return value from index
		System.out.println("3: "+list.get(3));
		
		
		//remove using index. removes the value from index position
		list.remove(0);
		System.out.println(list.toString());
		//remove using value/element. remove element first occurence
		list.remove("white");
		System.out.println(list.toString());
		
		//set (index,value) replace certain index with new element
		//System.out.println();
		
		
		
	}
}
