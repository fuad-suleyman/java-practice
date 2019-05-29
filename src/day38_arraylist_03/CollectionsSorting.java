package day38_arraylist_03;

import java.util.*;

public class CollectionsSorting {

	public static void main(String[] args) {

		List<Integer> numList = new ArrayList<>();
		numList.add(44);
		numList.add(1);
		numList.add(1000);
		numList.add(4);
		numList.add(3);

		System.out.println(numList);

		Collections.sort(numList);
		System.out.println(numList);

		List<String> str = new ArrayList<>();

		str.add("Fuad");
		str.add("Roman");
		str.add("Murad");
		str.add("Muhabbat");
		str.add("Maria");
		str.add("Dina");
		str.add("Bojan");
		System.out.println(str);

		Collections.sort(str);
		System.out.println(str);

		int max = Collections.max(numList);
		int min = Collections.min(numList);
		System.out.println("MinNum " + min);
		System.out.println("MaxNum " + max);

		String maxName = Collections.max(str);
		String minName = Collections.min(str);
		System.out.println("MaxName: " + maxName);
		System.out.println("MinName: " + minName);
		
		Collections.shuffle(str);
		System.out.println(str);
		
				

	}
}
