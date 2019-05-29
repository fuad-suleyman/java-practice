package day36_wrapperclasses_arraylistintroduction;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		//Create an arraylist
		
		String [] str= new String [5];
		ArrayList <String> names = new ArrayList<>();
		
		int [] numArray=new int [5];
		ArrayList<Integer> nums= new ArrayList<>();
		
		//assign values into arraylist
		names.add("Fuad");
		names.add("Nahid");
		names.add("Seyad");
		names.add("Ferid");
		names.add("Nicat");
		names.add("Tural");
		
		nums.add(100);
		nums.add(new Integer("100"));
		nums.add(1994);
		nums.add(555);
		nums.add(1202);
		nums.add(1984);
	
		System.out.println(names.size());
		System.out.println(names);
		System.out.println(names.get(5));
		System.out.println(names.indexOf("Tural"));
		//System.out.println(names.to);
		
		
		
	}
}
