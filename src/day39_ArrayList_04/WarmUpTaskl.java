package day39_ArrayList_04;

import java.util.*;

import day13_ternary_strings_intro.MoreTernary;

public class WarmUpTaskl {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();

		cities.add("Tokyo");
		cities.add("New York");
		cities.add(0, "Paris");
		cities.add("Pittsburgh");
		cities.add(1, "Berlin");
		cities.add("Madrid");
		cities.add("Moscow");
		cities.add("Istanbul");
		cities.add("Washington D.C.");
		cities.add("Amsterdam");
		cities.add("Zurich");
		cities.add("Singapore");
		cities.add("Milan");
		cities.add("Toronto");
		cities.add("London");
		
		for(String word: cities) {
			System.out.print(word+" | ");
		}
		
		System.out.println();
		
		////////////////////////////////////////////////////////////
		
			for(int i=0; i<cities.size(); i++) {
				System.out.print(cities.get(i)+" | ");
			}
			System.out.println();
			
			
		///////////////////////////////////////////////////////////	
			
			System.out.print(cities.toString().toUpperCase());
			System.out.println();
			
			
		///////////////////////////////////////////////////////////	
			cities.add("Lima");	
			for(int i=0; i<cities.size(); i++) {
				String n=cities.get(i).toUpperCase();
				cities.set(i,n );
			}
		System.out.println(cities);
		
		int min=1000;
		int max=0;
		String longest="";
		String shortest="cvfdsffsfsfsdff";
		
		for (int i=0; i<cities.size(); i++) {
			if(cities.get(i).length()<min) {min=cities.get(i).length();}
		}
		
		
		for(int j=0; j<cities.size(); j++) {
			if (cities.get(j).length()>longest.length()) {longest=cities.get(j);}
		}
		System.out.println("Longest city: "+longest);
		
		//////////////////////////////////////////////////////////////////////////
		
		for(int j=0; j<cities.size(); j++) {
			if (cities.get(j).length()<shortest.length()) {shortest=cities.get(j);}
		}
		System.out.println("Shortest city: "+shortest);
		
		
		ArrayList<String>citiesMoreThan6=new ArrayList<>();
		
		for(String city:cities) {
			if(city.length()>6) {citiesMoreThan6.add(city);}
			
		}
		System.out.println(citiesMoreThan6);
		
		
		
	}

}
