package day38_arraylist_03;

import java.util.*;

public class ContainsMethod {
	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");

		System.out.println(list1.toString());

		ArrayList<String> months = new ArrayList<>(list1); // >>>copying all the values from list1;
		System.out.println(months.toString());
		months.add("Jun");
		months.add("Jul");
		months.add("Aug");
		System.out.println(months.toString());
		
		System.out.println(months.contains("Jan"));
		System.out.println(months.contains("Sep"));
		
		ArrayList<String>months2=new ArrayList(list1);
		
		System.out.println("***********");
		months2.add("Jan");
		System.out.println(months.containsAll(months2));
	}

}
