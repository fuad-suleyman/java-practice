package day36_wrapperclasses_arraylistintroduction;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {

		ArrayList<String> languages=new ArrayList<>();
		languages.add("Java");
		languages.add("English");
		languages.add("Spanish");
		languages.add("Arabic");
		languages.add("Russian");
		languages.add("Ukranian");
		languages.add("Azerbaijani");
		System.out.println(languages.size());
		languages.add("Turkish");
		System.out.println(languages.size());
		languages.remove(0);
		System.out.println(languages.size());
		System.out.println(languages);
	}
}
